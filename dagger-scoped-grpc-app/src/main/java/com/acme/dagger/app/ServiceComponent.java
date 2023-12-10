package com.acme.dagger.app;

//import com.acme.dagger.grpc.DeviceServiceImplGrpcServiceModule;
//import com.acme.dagger.grpc.DeviceServiceImplServiceDefinition;
//import com.acme.dagger.grpc.DeviceServiceImplUnscopedGrpcServiceModule;
import com.acme.dagger.grpc.DeviceServiceImplGrpcServiceModule;
import com.acme.dagger.grpc.DeviceServiceImplServiceDefinition;
import dagger.Subcomponent;
import dagger.grpc.server.CallScoped;
import dagger.grpc.server.GrpcCallMetadataModule;

@CallScoped
@Subcomponent(
        modules = {
                //NettyServerModule.class,
                //DeviceServiceImplUnscopedGrpcServiceModule.class,
                DeviceServiceImplGrpcServiceModule.class,
                GrpcCallMetadataModule.class,
                //GrpcImplModule.class,
                MyModuleInstalledInSubcomponentOrAncestor.class
        })
// Try https://github.com/google/dagger/blob/master/javatests/dagger/grpc/functional/server/CoffeeServerWithUnscopedService.java
public interface ServiceComponent extends DeviceServiceImplServiceDefinition {

    //Server server();
/*
    @Subcomponent.Builder
    interface Builder {

        @BindsInstance
        Builder grpcCallMetadataModule(GrpcCallMetadataModule grpcCallMetadataModule);

        //@BindsInstance
        //Builder myGrpcModule(MyGrpcImplModule databaseImplModule);

        //Builder nettyServerModule(NettyServerModule nettyServerModule);

        //@BindsInstance
        //Builder nn(DeviceServiceImplGrpcServiceModule x);

        GrpcComponent build();
    }*/
}
