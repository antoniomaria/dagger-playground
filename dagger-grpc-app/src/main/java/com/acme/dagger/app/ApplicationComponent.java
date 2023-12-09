package com.acme.dagger.app;

import dagger.Component;
import dagger.grpc.server.GrpcService;

@AppScope
@Component(modules = {AppModule.class,
        GrpcModule.class}
)
public interface ApplicationComponent {

    // @Singleton
    // Database database();

    // DatabaseSchema databaseSchema();

    //@PrivateToDatabase
    //io.grpc.Server server();
    //@PrivateToDatabase
    //@AppScope
    //GrpcWrapper server();

    AcmeServer server();

    // DatabaseConnectionPool databaseConnectionPool();

    //MyGrpcComponent newGrpcComponent()

    GrpcComponent.Builder grpcComponent();

    void inject(ApplicationMain main);
}
