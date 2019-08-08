package com.lichunorz.netty.starter.socket.server;

import com.lichunorz.netty.starter.util.N;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.UUID;

public class SocketServerHandler extends SimpleChannelInboundHandler<String> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {
        N.log(ctx.channel().remoteAddress().toString() + " ===> " + msg);
        ctx.writeAndFlush("hello," + UUID.randomUUID());
    }
}
