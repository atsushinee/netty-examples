package com.lichunorz.netty.starter.protobuf;

import com.lichunorz.netty.starter.util.N;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class ProtoBufServerApplication {

    public static void main(String[] args) throws InterruptedException {
        N.runNettyProtobufServer(new SimpleChannelInboundHandler<ProtobufMessage.Message>() {
            @Override
            protected void channelRead0(ChannelHandlerContext channelHandlerContext, ProtobufMessage.Message message) throws Exception {
                final ProtobufMessage.Cat cat = message.getCat();
                N.log(cat.getName());
                N.log(cat.getCity());

                final ProtobufMessage.Dog dog = message.getDog();
                N.log(dog.getName());
                N.log(dog.getAge());

                final ProtobufMessage.Person person = message.getPerson();
                N.log(person.getName());
                N.log(person.getAge());
                N.log(person.getAddress());
            }

            @Override
            public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
                cause.printStackTrace();
                ctx.close();
            }
        });
    }
}
