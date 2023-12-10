package com.acme.dagger.app;

// import com.acme.api.v1.DeviceServiceImplServiceDefinition;
import com.acme.dagger.grpc.DeviceServiceImplServiceDefinition;
import dagger.Module;
import dagger.Provides;
import dagger.grpc.server.ForGrpcService;
import io.grpc.ServerInterceptor;

import java.util.Collections;
import java.util.List;

@Module
public abstract class MyModuleInstalledInSubcomponentOrAncestor {
  //@Binds
  //abstract DeviceServiceImplServiceDefinition grpcComponent(GrpcComponent grpcComponent);

  // Mandatory dependency for DeviceServiceImplGrpcServiceModule

  @Provides
  @ForGrpcService(com.acme.api.v1.DeviceServiceGrpc.class)
  static List<? extends ServerInterceptor> helloInterceptors() {
    // return Arrays.asList(authInterceptor, loggingInterceptor);
    return Collections.emptyList();
  }
}
