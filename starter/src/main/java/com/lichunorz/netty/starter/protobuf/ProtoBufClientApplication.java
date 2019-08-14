package com.lichunorz.netty.starter.protobuf;

import com.lichunorz.netty.starter.util.N;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class ProtoBufClientApplication {

    public static void main(String[] args) throws InterruptedException {
        N.runNettyProtobufClient(new SimpleChannelInboundHandler<ProtobufMessage.Message>() {
            @Override
            protected void channelRead0(ChannelHandlerContext channelHandlerContext, ProtobufMessage.Message message) throws Exception {

            }

            @Override
            public void channelActive(ChannelHandlerContext ctx) throws Exception {
                final ProtobufMessage.Message.Builder builder = ProtobufMessage.Message.newBuilder();

                builder.setDataType(ProtobufMessage.Message.DataType.Dog)
                        .setDog(ProtobufMessage.Dog.newBuilder().setName("拉布拉多").setAge(3).build());


//                builder.setDataType(ProtobufMessage.Message.DataType.Cat)
//                        .setCat(ProtobufMessage.Cat.newBuilder().setName("蓝猫").setCity("zzz").build());


//                builder.setDataType(ProtobufMessage.Message.DataType.Person)
//                        .setPerson(ProtobufMessage.Person.newBuilder().setName("伊泽瑞尔").setAge(13).setAddress("future").build());

                ctx.writeAndFlush(builder.build());
            }
        });
    }
}
