package com.lichunorz.netty.starter.http;

import com.lichunorz.netty.starter.util.N;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

// 异步  &&  事件驱动
public class NettyHttpApplication {

    public static void main(String[] args) throws InterruptedException {
        // 定义 两个 基于 NIO 的事件循环组
        // 由 parentGroup 接收连接 分配给 childGroup 进行真正的处理
        EventLoopGroup parentGroup = new NioEventLoopGroup();
        EventLoopGroup childGroup = new NioEventLoopGroup();

        try {
            ServerBootstrap serverBootstrap = new ServerBootstrap();

            serverBootstrap.group(parentGroup, childGroup)
                    .channel(NioServerSocketChannel.class)
                    .childHandler(new ServerInitializer()); // 子请求处理器

            final ChannelFuture channelFuture = serverBootstrap.bind(8899).sync();
            N.log("Server is running on http://localhost:8899");
            channelFuture.channel().closeFuture().sync();
        } finally {
            parentGroup.shutdownGracefully();
            childGroup.shutdownGracefully();
        }
    }
}
