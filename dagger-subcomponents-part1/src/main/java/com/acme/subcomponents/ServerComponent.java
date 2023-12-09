package com.acme.subcomponents;

import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = ServerModule.class)
interface ServerComponent {
    RequestRouter requestRouter();
}