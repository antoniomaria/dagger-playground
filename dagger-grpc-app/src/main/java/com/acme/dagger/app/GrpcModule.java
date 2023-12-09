package com.acme.dagger.app;

import com.typesafe.config.Config;
import dagger.Module;
import dagger.Provides;
import dagger.grpc.server.NettyServerModule;

@Module(subcomponents = GrpcComponent.class)
public class GrpcModule {

  @Provides
  @PrivateToDatabase
  io.grpc.Server provideDatabase(
      GrpcComponent.Builder mygrpcComponentBuilder,
      Config config
      ) {
    System.out.println("config is " + config);

    NettyServerModule netty = NettyServerModule.bindingToPort(9090);

    GrpcComponent grpc = mygrpcComponentBuilder.nettyServerModule(netty).build();
//return  new GrpcWrapper(grpc.server());
    return grpc.server();

  }
}
