package com.lichunorz.zerocopy;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class OldServer {

    public static void main(String[] args) throws Exception {
        final ServerSocket serverSocket = new ServerSocket(8899);
        while (true) {
            final Socket socket = serverSocket.accept();
            final DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            try {
                byte[] bytes = new byte[1024 * 4];
                while (true) {
                    int readCount = inputStream.read(bytes);
                    if (readCount == -1) {
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
