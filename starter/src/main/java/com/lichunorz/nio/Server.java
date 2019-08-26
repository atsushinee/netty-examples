package com.lichunorz.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Server {

    private static Map<String, SocketChannel> clientMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        Selector selector = Selector.open();

        final ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.socket().bind(new InetSocketAddress(8899));
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

        while (true) {
            selector.select();
            final Set<SelectionKey> keys = selector.selectedKeys();
            final Iterator<SelectionKey> iterator = keys.iterator();
            while (iterator.hasNext()) {
                final SelectionKey key = iterator.next();
                final SocketChannel client;
                try {

                    if (key.isAcceptable()) {
                        final ServerSocketChannel channel = ((ServerSocketChannel) key.channel());

                        client = channel.accept();
                        client.configureBlocking(false);
                        client.register(selector, SelectionKey.OP_READ);
                        clientMap.put("[" + UUID.randomUUID().toString() + "]", client);

                    } else if (key.isReadable()) {
                        client = (SocketChannel) key.channel();
                        ByteBuffer readBuffer = ByteBuffer.allocate(512);
                        final int read = client.read(readBuffer);
                        if (read > 0) {
                            readBuffer.flip();
                            String receiveMessage = String.valueOf(StandardCharsets.UTF_8.decode(readBuffer).array());
                            System.out.println(client + ":" + receiveMessage);
                            String senderKey = null;
                            for (Map.Entry<String, SocketChannel> entry : clientMap.entrySet()) {
                                if (client == entry.getValue()) {
                                    senderKey = entry.getKey();
                                    break;
                                }
                            }
                            for (Map.Entry<String, SocketChannel> entry : clientMap.entrySet()) {
                                final SocketChannel value = entry.getValue();
                                ByteBuffer writeBuffer = ByteBuffer.allocate(512);
                                writeBuffer.put((senderKey + ":" + receiveMessage).getBytes());
                                writeBuffer.flip();
                                value.write(writeBuffer);
                            }
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                iterator.remove();
            }
        }
    }
}
