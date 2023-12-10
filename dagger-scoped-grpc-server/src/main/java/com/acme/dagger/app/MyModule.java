package com.acme.dagger.app;

import com.acme.dagger.grpc.DeviceServiceImplServiceDefinition;

import dagger.Module;
import dagger.Provides;
import dagger.grpc.server.GrpcCallMetadataModule;

@Module
public class MyModule {

    @Provides
    static DeviceServiceImplServiceDefinition.Factory helloComponent(
            final MyComponent myComponent) {
        return new DeviceServiceImplServiceDefinition.Factory() {
            @Override
            public DeviceServiceImplServiceDefinition grpcService(
                    GrpcCallMetadataModule metadataModule) {
                return myComponent.serviceComponent(metadataModule);
            }
        };
    }
}
