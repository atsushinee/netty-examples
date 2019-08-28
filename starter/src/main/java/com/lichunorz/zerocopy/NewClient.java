package com.lichunorz.zerocopy;

import java.io.FileInputStream;
import java.net.InetSocketAddress;
import java.nio.channels.FileChannel;
import java.nio.channels.SocketChannel;

public class NewClient {
    public static void main(String[] args) throws Exception {
        final SocketChannel socketChannel = SocketChannel.open();

        socketChannel.connect(new InetSocketAddress("localhost", 8899));
        socketChannel.configureBlocking(true);

        String fileName = "C:\\Users\\atsus\\Desktop\\jdk-11.0.3_windows-x64_bin.exe";

        FileChannel fileChannel = new FileInputStream(fileName).getChannel();

        long startTime = System.currentTimeMillis();

        long transferCount = fileChannel.transferTo(0, fileChannel.size(), socketChannel);

        System.out.println("发送总字节数: " + transferCount + ", 耗时: " + (System.currentTimeMillis() - startTime));
        fileChannel.close();
    }
}
