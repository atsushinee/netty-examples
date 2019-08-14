package com.lichunorz.netty.starter.util;

import com.lichunorz.netty.starter.protobuf.ProtobufMessage;
import io.netty.bootstrap.Bootstrap;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Consumer;

public class N {
    private static ThreadLocal<DateFormat> formatter = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));

    public static void log(Object msg) {
        System.out.printf("\033[31m%s\033[0m:  %s\n",
                formatter.get().format(new Date()),
                msg);
    }

    public static void log() {
        final StackTraceElement caller = new Throwable().getStackTrace()[1];
//        final String[] clazz = caller.getClassName().split("[.]");
//        final String className = clazz[clazz.length - 1];
        System.out.printf("\033[31m%s\033[0m:  [%d]%-20s\n",
                formatter.get().format(new Date()),
                caller.getLineNumber(),
                caller.getMethodName());
    }


    public static void runNettyServer(Consumer<SocketChannel> action) throws InterruptedException {
        EventLoopGroup parentGroup = new NioEventLoopGroup();
        EventLoopGroup childGroup = new NioEventLoopGroup();
        try {
            final ServerBootstrap serverBootstrap = new ServerBootstrap()
                    .group(parentGroup, childGroup)
                    .channel(NioServerSocketChannel.class)
                    .handler(new LoggingHandler(LogLevel.INFO))
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel socketChannel) {
                            action.accept(socketChannel);
                        }
                    });
            final ChannelFuture channelFuture = serverBootstrap.bind(8899).sync();
            channelFuture.channel().closeFuture().sync();
        } finally {
            parentGroup.shutdownGracefully();
            childGroup.shutdownGracefully();
        }
    }

    public static void runNettyClient(Consumer<SocketChannel> action) throws InterruptedException {
        EventLoopGroup group = new NioEventLoopGroup();
        try {
            final Bootstrap bootstrap = new Bootstrap()
                    .group(group)
                    .channel(NioSocketChannel.class)
                    .handler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel socketChannel) {
                            action.accept(socketChannel);
                        }
                    });
            final ChannelFuture channelFuture = bootstrap.connect("localhost", 8899).sync();
            channelFuture.channel().closeFuture().sync();
        } finally {
            group.shutdownGracefully();
        }
    }

    public static void runNettyProtobufServer(ChannelHandler channelHandler) throws InterruptedException {
        runNettyServer(initProtobufInitializer(channelHandler));
    }

    public static void runNettyProtobufClient(ChannelHandler channelHandler) throws InterruptedException {
        runNettyClient(initProtobufInitializer(channelHandler));
    }

    private static Consumer<SocketChannel> initProtobufInitializer(ChannelHandler channelHandler) {
        return socketChannel -> {
            final ChannelPipeline pipeline = socketChannel.pipeline();
            pipeline.addLast(new ProtobufVarint32FrameDecoder());
            pipeline.addLast(new ProtobufDecoder(ProtobufMessage.Message.getDefaultInstance()));
            pipeline.addLast(new ProtobufVarint32LengthFieldPrepender());
            pipeline.addLast(new ProtobufEncoder());
            pipeline.addLast(channelHandler);
        };
    }
}
