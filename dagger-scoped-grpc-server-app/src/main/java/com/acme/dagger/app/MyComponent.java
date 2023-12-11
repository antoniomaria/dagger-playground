package com.acme.dagger.app;

import com.acme.dagger.grpc.DeviceServiceImplGrpcProxyModule;
import com.acme.dagger.grpc.DeviceServiceImplUnscopedGrpcServiceModule;
import dagger.Component;
import dagger.Subcomponent;
import dagger.grpc.server.GrpcCallMetadataModule;
import dagger.grpc.server.NettyServerModule;
import io.grpc.Server;

import javax.inject.Singleton;

@Singleton
@Subcomponent(modules = {DeviceServiceImplGrpcProxyModule.class, MyModule.class, NettyServerModule.class})
public abstract class MyComponent extends AcmeServer{
    abstract ServiceComponent serviceComponent(GrpcCallMetadataModule metadataModule);
    //Server server();

    @Subcomponent.Builder
    interface Builder {

        //@BindsInstance
        //Builder myGrpcModule(MyGrpcImplModule databaseImplModule);

        Builder nettyServerModule(NettyServerModule nettyServerModule);

        //@BindsInstance
        //Builder nn(DeviceServiceImplGrpcServiceModule x);

        MyComponent build();
    }
}
