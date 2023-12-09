package com.acme.dagger.app;

import com.acme.dagger.grpc.DeviceServiceImplServiceDefinition;
import com.acme.dagger.grpc.DeviceServiceImplUnscopedGrpcServiceModule;
import dagger.Subcomponent;
import dagger.grpc.server.NettyServerModule;
import io.grpc.Server;

import javax.inject.Singleton;

@Subcomponent(
        modules = {
                NettyServerModule.class,
                DeviceServiceImplUnscopedGrpcServiceModule.class,
                GrpcImplModule.class
        })
@Singleton
public interface GrpcComponent extends DeviceServiceImplServiceDefinition {

    Server server();

    @Subcomponent.Builder
    interface Builder {

        //@BindsInstance
        //Builder myGrpcModule(MyGrpcImplModule databaseImplModule);

        Builder nettyServerModule(NettyServerModule nettyServerModule);

        //@BindsInstance
        //Builder nn(DeviceServiceImplGrpcServiceModule x);

        GrpcComponent build();
    }
}
