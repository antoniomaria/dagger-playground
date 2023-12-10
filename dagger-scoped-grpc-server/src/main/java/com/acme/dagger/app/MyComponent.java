package com.acme.dagger.app;

import com.acme.dagger.grpc.DeviceServiceImplGrpcProxyModule;
import dagger.Component;
import dagger.grpc.server.GrpcCallMetadataModule;
import dagger.grpc.server.NettyServerModule;
import io.grpc.Server;

import javax.inject.Singleton;

@Singleton
@Component(modules = {DeviceServiceImplGrpcProxyModule.class, MyModule.class, NettyServerModule.class})
public interface MyComponent{
    ServiceComponent serviceComponent(GrpcCallMetadataModule metadataModule);
    Server server();
}
