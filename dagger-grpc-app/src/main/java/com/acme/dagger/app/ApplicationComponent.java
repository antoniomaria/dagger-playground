package com.acme.dagger.app;

import dagger.Component;

@AppScope
@Component(modules = {AppModule.class,
        GrpcModule.class}
)
public interface ApplicationComponent {

  // @Singleton
  // Database database();

  // DatabaseSchema databaseSchema();

  //@PrivateToDatabase
  //@AppScope
  GrpcWrapper server();

  // DatabaseConnectionPool databaseConnectionPool();

  //MyGrpcComponent newGrpcComponent()

  GrpcComponent.Builder grpcComponent();

  void inject(ApplicationMain main);
}
