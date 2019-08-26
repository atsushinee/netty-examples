package com.lichunorz.nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) throws IOException {
        final Selector selector = Selector.open();
        final SocketChannel socketChannel = SocketChannel.open();
        socketChannel.configureBlocking(false);

        socketChannel.register(selector, SelectionKey.OP_CONNECT);
        socketChannel.connect(new InetSocketAddress(8899));
        while (true) {
            selector.select();
            final Set<SelectionKey> selectionKeys = selector.selectedKeys();
            final Iterator<SelectionKey> iterator = selectionKeys.iterator();
            while (iterator.hasNext()) {
                final SelectionKey selectionKey = iterator.next();
                if (selectionKey.isConnectable()) {
                    final SocketChannel client = (SocketChannel) selectionKey.channel();
                    if (client.isConnectionPending()) {
                        client.finishConnect();
                        ByteBuffer writeBuffer = ByteBuffer.allocate(512);
                        writeBuffer.put(StandardCharsets.UTF_8.encode(LocalDateTime.now() + "连接成功!"));
                        writeBuffer.flip();
                        client.write(writeBuffer);
                        ExecutorService executorService = Executors.newSingleThreadExecutor();
                        executorService.submit(() -> {
                            while (true) {
                                try {
                                    writeBuffer.clear();
                                    final InputStreamReader inputStreamReader = new InputStreamReader(System.in);
                                    final BufferedReader reader = new BufferedReader(inputStreamReader);
                                    final String message = reader.readLine();
                                    if (".quit".equals(message)) {
                                        break;
                                    }
                                    writeBuffer.put(message.getBytes());
                                    writeBuffer.flip();
                                    client.write(writeBuffer);
                                } catch (Exception ex) {
                                    ex.printStackTrace();
                                }
                            }
                            executorService.shutdown();
                        });
                    }
                    client.register(selector, SelectionKey.OP_READ);
                } else if (selectionKey.isReadable()) {
                    final SocketChannel client = (SocketChannel) selectionKey.channel();
                    ByteBuffer byteBuffer = ByteBuffer.allocate(512);
                    final int read = client.read(byteBuffer);
                    if (read > 0) {
                        final String message = new String(byteBuffer.array(), 0, read);
                        System.out.println(message);
                    }
                }
                iterator.remove();
            }
        }

    }
}
