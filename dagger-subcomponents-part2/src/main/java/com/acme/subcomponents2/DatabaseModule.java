package com.acme.subcomponents2;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module(subcomponents = DatabaseComponent.class)
public class DatabaseModule {

  @NumberOfCores
  @Provides
  int getNumberOfCore() {
    return 10;
  }

  @Provides
  @Singleton
  Database provideDatabase(
      @NumberOfCores int numberOfCore, DatabaseComponent.Builder databaseComponentBuilder) {
    return databaseComponentBuilder
        .databaseImplModule(new DatabaseImplModule((numberOfCore / 2)))
        .build()
        .database();
  }
}
