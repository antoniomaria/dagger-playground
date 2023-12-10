package com.acme.dagger.app;

import dagger.grpc.server.GrpcCallMetadataModule;
import dagger.grpc.server.NettyServerModule;
import io.grpc.Server;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 9090;

        MyComponent component =
                DaggerMyComponent.builder()
                        .nettyServerModule(NettyServerModule.bindingToPort(port))
                        .build();
        Server server = component.server();
        server.start();

        System.out.println("Sever listing in port " + port);
        server.awaitTermination();
    }
}
