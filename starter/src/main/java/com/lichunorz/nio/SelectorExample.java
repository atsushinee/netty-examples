package com.lichunorz.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

public class SelectorExample {
    public static void main(String[] args) throws IOException {
        final Selector selector = Selector.open();

        int[] ports = new int[]{5001, 5002, 5003, 5004, 5005};

        for (int port : ports) {
            final ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.configureBlocking(false);
            serverSocketChannel.socket().bind(new InetSocketAddress(port));

            serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
            System.out.println("监听端口:" + port);
        }

        while (true) {
            final int numbers = selector.select();
            System.out.println("numbers:" + numbers);
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            System.out.println("selectionKeys:" + selectionKeys);
            final Iterator<SelectionKey> iterator = selectionKeys.iterator();
            while (iterator.hasNext()) {
                final SelectionKey selectionKey = iterator.next();
                if (selectionKey.isAcceptable()) {
                    final ServerSocketChannel channel = (ServerSocketChannel) selectionKey.channel();
                    final SocketChannel socketChannel = channel.accept();
                    socketChannel.configureBlocking(false);
                    socketChannel.register(selector, SelectionKey.OP_READ);
                    iterator.remove();
                    System.out.println("获取客户端连接:" + socketChannel);
                } else if (selectionKey.isReadable()) {
                    SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
                    int bytesRead = 0;

                    while (true) {
                        final ByteBuffer byteBuffer = ByteBuffer.allocate(512);
                        byteBuffer.clear();
                        int read = socketChannel.read(byteBuffer);
                        if (read <= 0) {
                            break;
                        }
                        byteBuffer.flip();
                        socketChannel.write(byteBuffer);
                        bytesRead += read;
                    }
                    System.out.println("读取：" + bytesRead + ",来自:" + socketChannel);
                    iterator.remove();
                }
            }
        }
    }
}
