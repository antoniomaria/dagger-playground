package com.acme.subcomponents2;

import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {AppModule.class, DatabaseModule.class})
public interface ApplicationComponent {

    //@Singleton
    Database database();

    //DatabaseSchema databaseSchema();

    //DatabaseConnectionPool databaseConnectionPool();

    void inject (ApplicationMain main);

}

