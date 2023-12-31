package com.acme.dagger;

import dagger.Component;

@Component(modules = {HelloWorldModule.class, SystemOutModule.class })
public interface CommandRouterFactory {

    CommandRouter router();

}
