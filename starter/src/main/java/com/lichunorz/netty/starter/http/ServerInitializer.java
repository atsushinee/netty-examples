package com.lichunorz.netty.starter.http;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpServerCodec;

public class ServerInitializer extends ChannelInitializer<SocketChannel> {

    // 连接 创建时 会执行
    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        final ChannelPipeline pipeline = socketChannel.pipeline(); // 获取通道管道，管道中可以有多个handler

        pipeline.addLast("httpServerCodec", new HttpServerCodec());
        pipeline.addLast("testHttpServerHandler", new HttpServerHandler());
    }
}
