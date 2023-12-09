package com.acme.dagger;

import dagger.Module;
import dagger.Provides;

@Module
public class SystemOutModule {

    @Provides
    static Outputter textOutputter() {
        return System.out::println;
    }
}
