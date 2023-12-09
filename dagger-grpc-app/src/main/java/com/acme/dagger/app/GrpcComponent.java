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
// Try https://github.com/google/dagger/blob/master/javatests/dagger/grpc/functional/server/CoffeeServerWithUnscopedService.java
public abstract class GrpcComponent extends AcmeServer implements DeviceServiceImplServiceDefinition {

    //Server server();

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
