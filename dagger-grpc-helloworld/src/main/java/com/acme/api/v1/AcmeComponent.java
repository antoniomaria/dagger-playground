package com.acme.api.v1;

import dagger.Binds;
import dagger.Component;
import dagger.Module;
import dagger.Provides;
import dagger.grpc.server.ForGrpcService;
import dagger.grpc.server.NettyServerModule;
import io.grpc.Server;
import io.grpc.ServerInterceptor;

import javax.inject.Singleton;
import java.util.Collections;
import java.util.List;

@Singleton
@Component(
    modules = {
      NettyServerModule.class,
      DeviceServiceImplUnscopedGrpcServiceModule.class,
      AcmeModule.class
    })
public interface AcmeComponent extends DeviceServiceImplServiceDefinition {
  Server server();
}
