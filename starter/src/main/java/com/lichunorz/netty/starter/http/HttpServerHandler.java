package com.lichunorz.netty.starter.http;

import com.lichunorz.netty.starter.util.N;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.*;
import io.netty.util.CharsetUtil;

// 自定义消息处理器
public class HttpServerHandler extends SimpleChannelInboundHandler<HttpObject> {

    // 接受客户端消息，返回响应
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, HttpObject httpObject) throws Exception {
        if (httpObject instanceof HttpRequest) {
            final HttpRequest request = (HttpRequest) httpObject;
            N.log(request.method() + " " + request.uri());
            // 构建服务端返回信息
            final ByteBuf content = Unpooled.copiedBuffer("Hello Netty", CharsetUtil.UTF_8);
            // 构建响应对象
            FullHttpResponse response = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.OK, content);
            // 设置头信息
            response.headers().set(HttpHeaderNames.CONTENT_TYPE, "text/plain");
            response.headers().set(HttpHeaderNames.CONTENT_LENGTH, content.readableBytes());

            ctx.writeAndFlush(response);
            // 主动关闭连接
//            ctx.channel().close();
        }
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        N.log();
        super.channelActive(ctx);
    }

    @Override
    public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
        N.log();
        super.channelRegistered(ctx);
    }

    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        N.log();
        super.handlerAdded(ctx);
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        N.log();
        super.channelInactive(ctx);
    }

    @Override
    public void channelUnregistered(ChannelHandlerContext ctx) throws Exception {
        N.log();
        super.channelUnregistered(ctx);
    }
}
