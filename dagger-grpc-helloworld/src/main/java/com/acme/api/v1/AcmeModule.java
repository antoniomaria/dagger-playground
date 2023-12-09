package com.acme.api.v1;

//import com.acme.api.v1.AcmeComponent;
//import com.acme.api.v1.DeviceServiceImplServiceDefinition;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.grpc.server.ForGrpcService;
import io.grpc.ServerInterceptor;

import java.util.Collections;
import java.util.List;

@Module
abstract class AcmeModule {
    @Binds
    abstract DeviceServiceImplServiceDefinition helloComponent(AcmeComponent acmeComponent);

    // Mandatory dependency for DeviceServiceImplGrpcServiceModule
    @Provides
    @ForGrpcService(com.acme.api.v1.DeviceServiceGrpc.class)
    static List<? extends ServerInterceptor> helloInterceptors() {
        // return Arrays.asList(authInterceptor, loggingInterceptor);
        return Collections.emptyList();
    }
}
