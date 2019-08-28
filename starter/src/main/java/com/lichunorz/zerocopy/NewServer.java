package com.lichunorz.zerocopy;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class NewServer {

    public static void main(String[] args) throws Exception {
        final ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        final ServerSocket serverSocket = serverSocketChannel.socket();
        serverSocket.setReuseAddress(true);
        serverSocket.bind(new InetSocketAddress(8899));
        ByteBuffer byteBuffer = ByteBuffer.allocate(4096);
        while (true) {
            final SocketChannel socketChannel = serverSocketChannel.accept();
            socketChannel.configureBlocking(true);
            int readCount = 0;
            while (-1 != readCount) {
                try {
                    readCount = socketChannel.read(byteBuffer);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                byteBuffer.rewind();
            }
        }
    }
}
