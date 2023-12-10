package com.acme.dagger.app;

import com.acme.dagger.grpc.DeviceServiceImplGrpcProxyModule;
import dagger.Component;
import dagger.grpc.server.GrpcCallMetadataModule;

import javax.inject.Singleton;

@Singleton
@Component(modules = {DeviceServiceImplGrpcProxyModule.class, MyModule.class})
public interface MyComponent{
    ServiceComponent serviceComponent(GrpcCallMetadataModule metadataModule);
}
