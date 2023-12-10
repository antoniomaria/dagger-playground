package com.acme.dagger.app;

import dagger.grpc.server.GrpcCallMetadataModule;
import dagger.grpc.server.NettyServerModule;

public class Main {

    public static void main(String[] args) {
        int port = 9090;
        DaggerMyComponent.create().serviceComponent(new GrpcCallMetadataModule());

        /*
        MyComponent component =
                DaggerMyComponent.builder()
                        .nettyServerModule(NettyServerModule.bindingToPort(port))
                        .build();*/
//        Server server = component.server();
     //   server.start();
    }
}
