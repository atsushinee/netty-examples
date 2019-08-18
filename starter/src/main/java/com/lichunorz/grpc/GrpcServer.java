package com.lichunorz.grpc;

import com.lichunorz.netty.starter.util.N;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcServer {

    private Server server;

    private void start() throws IOException {
        this.server = ServerBuilder.forPort(8899).addService(new GrpcServiceImpl()).build();
        this.server.start();
        Runtime.getRuntime().addShutdownHook(new Thread(this::stop));
        N.log("server start...");
    }

    private void stop() {
        if (null != this.server) {
            this.server.shutdown();
        }
    }

    private void awaitTermination() throws InterruptedException {
        if (null != this.server) {
            this.server.awaitTermination();
        }
    }


    public static void main(String[] args) throws InterruptedException, IOException {
        GrpcServer s = new GrpcServer();
        s.start();
        s.awaitTermination();
    }
}
