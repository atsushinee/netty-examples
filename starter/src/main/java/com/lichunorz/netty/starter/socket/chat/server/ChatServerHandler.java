package com.lichunorz.netty.starter.socket.chat.server;

import com.lichunorz.netty.starter.util.N;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

public class ChatServerHandler extends SimpleChannelInboundHandler<String> {

    private static final String PREFIX = "💡💡💡 ";
    private static final ChannelGroup channelGroup = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, String s) throws Exception {
        final Channel channel = channelHandlerContext.channel();
        channelGroup.forEach(ch -> {
            if (ch != channel) {
                ch.writeAndFlush(channel.remoteAddress() + " ===> " + s);
            } else {
                ch.writeAndFlush("😀😀😀 ===> " + s);
            }
        });
    }

    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        final Channel channel = ctx.channel();
        channelGroup.writeAndFlush(PREFIX + channel.remoteAddress() + " join...\n");
        channelGroup.add(channel);
    }

    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
        final Channel channel = ctx.channel();
        channelGroup.writeAndFlush(PREFIX + channel.remoteAddress() + " left...\n");
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        N.log(ctx.channel().remoteAddress() + " 上线");
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        N.log(ctx.channel().remoteAddress() + " 下线");
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
