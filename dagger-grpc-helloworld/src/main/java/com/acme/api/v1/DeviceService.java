package com.acme.api.v1;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import dagger.grpc.server.NettyServerModule;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class DeviceService {
    public static void main(String[] args) throws Exception {
        System.out.println("starting the grpc server");
        new DeviceService().init();
    }

    private void init() throws Exception {
        // Bootstrap the GRPC server using Dagger

        AcmeComponent component = DaggerAcmeComponent.builder().
                nettyServerModule(NettyServerModule.bindingToPort(9090)).
                build();

        Server server = component.server();

        System.out.println("GRPC service listening in port 9090");
        server.start();

        server.awaitTermination();
    }

    public void startGrpcServer() throws InterruptedException, IOException {
        // Bootstrap the GRPC server using native GRPC methods
        Server server = ServerBuilder
                .forPort(9090)
                .addService(new DeviceServiceImpl()).build();

        System.out.println("Device service listening in port 9090");

        server.start();
        server.awaitTermination();
    }
}
