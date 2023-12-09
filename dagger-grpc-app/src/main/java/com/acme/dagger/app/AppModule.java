package com.acme.dagger.app;

import com.typesafe.config.Config;
import dagger.Module;
import dagger.Provides;
import javax.annotation.Nonnull;

@Module
public class AppModule {
    private Config appConfig;

    public AppModule(@Nonnull Config config) {
        appConfig = config;
    }

    @Provides
    public Config provideContext() {
        return appConfig;
    }
}
