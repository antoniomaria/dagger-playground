package com.acme.subcomponents2;

import dagger.Subcomponent;

@Subcomponent(modules = DatabaseImplModule.class)
public interface DatabaseComponent {

    @PrivateToDatabase
    public Database database();

    @Subcomponent.Builder
    interface Builder{
        Builder databaseImplModule(DatabaseImplModule databaseImplModule);
        DatabaseComponent build();
    }
}
