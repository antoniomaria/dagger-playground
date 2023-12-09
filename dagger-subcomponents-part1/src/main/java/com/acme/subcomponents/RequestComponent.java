package com.acme.subcomponents;

import dagger.BindsInstance;
import dagger.Subcomponent;

@Subcomponent(modules = RequestModule.class)
interface RequestComponent {
  RequestHandler requestHandler();

  @Subcomponent.Builder
  interface Builder {
    @BindsInstance
    Builder data(Data data);

    Builder requestModule(RequestModule module);

    RequestComponent build();
  }
}
