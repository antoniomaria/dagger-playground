package com.acme.dagger.app;

import com.typesafe.config.Config;
import dagger.Module;
import dagger.Provides;
import dagger.grpc.server.NettyServerModule;

@Module(subcomponents = MyComponent.class)
public class GrpcModule {

    @Provides
    AcmeServer provideGrpcServer(MyComponent.Builder mygrpcComponentBuilder, Config config) {
        System.out.println("config is " + config);
        NettyServerModule netty = NettyServerModule.bindingToPort(9090);
        MyComponent grpc = mygrpcComponentBuilder.nettyServerModule(netty).build();
        return grpc;
    }
}
