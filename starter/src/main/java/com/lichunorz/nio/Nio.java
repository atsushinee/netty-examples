package com.lichunorz.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;

/**
 * NIO 核心概念 ： selector \ channel \ buffer
 * block \ buffer
 * position \ limit \ capacity
 */
public class Nio {

    public static void main(String[] args) throws Exception {
        server();
//        flip();
//        intBuffer();
//        read();
//        write();

    }

    private static void flip() {
        IntBuffer buffer = IntBuffer.allocate(3);
        buffer.put(1);
        buffer.put(2);
        buffer.put(3);
        buffer.flip();
        buffer.put(4);
        buffer.flip();
        while (buffer.hasRemaining()) {
            System.out.println(buffer.get());
        }
    }

    private static void intBuffer() throws NoSuchAlgorithmException {
        final SecureRandom secureRandom = SecureRandom.getInstanceStrong();
        IntBuffer buffer = IntBuffer.allocate(10);
        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put(secureRandom.nextInt(20));
        }
        buffer.flip();
        while (buffer.hasRemaining()) {
            System.out.print(buffer.get());
            System.out.print(" ");
        }
        System.out.println();
    }

    private static void read() throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream("txt/nio-read-test.txt")) {
            FileChannel channel = fileInputStream.getChannel();
            ByteBuffer byteBuffer = ByteBuffer.allocate(fileInputStream.available());
            channel.read(byteBuffer);
            byteBuffer.flip();
            while (byteBuffer.hasRemaining()) {
                System.out.print((char) byteBuffer.get());
            }
            System.out.println();
        }
    }

    private static void write() throws IOException {
        try (FileOutputStream outputStream = new FileOutputStream("txt/nio-write-test.txt")) {
            final FileChannel channel = outputStream.getChannel();
            final byte[] bytes = "hello lichunoooooozzzzzzzzzzzzzrrrrrrrrrr".getBytes();
            ByteBuffer byteBuffer = ByteBuffer.allocate(bytes.length);
            for (byte b : bytes) {
                byteBuffer.put(b);
            }
            byteBuffer.flip();
            channel.write(byteBuffer);
        }
    }

    private static void server() throws IOException {

        final ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        InetSocketAddress address = new InetSocketAddress(8899);
        serverSocketChannel.socket().bind(address);

        int messageLength = 2 + 3 + 4;
        ByteBuffer[] buffers = new ByteBuffer[3];

        buffers[0] = ByteBuffer.allocate(2);
        buffers[1] = ByteBuffer.allocate(3);
        buffers[2] = ByteBuffer.allocate(4);
        final SocketChannel socketChannel = serverSocketChannel.accept();

        while (true) {
            int bytesRead = 0;
            while (bytesRead < messageLength) {
                long r = socketChannel.read(buffers);
                bytesRead += r;
                System.out.println("bytesRead: " + bytesRead);
                Arrays.stream(buffers).map(buffer -> "position: " + buffer.position() + ", limit: " + buffer.limit())
                        .forEach(System.out::println);
            }
            Arrays.asList(buffers).forEach(Buffer::flip);

            long bytesWritten = 0;
            while (bytesWritten < messageLength) {
                long r = socketChannel.write(buffers);
                bytesWritten += r;
            }
            Arrays.asList(buffers).forEach(Buffer::clear);
            System.out.println("bytesRead: " + bytesRead + ", bytesWritten: " + bytesWritten + ", messageLength:" + messageLength);
        }
    }
}
