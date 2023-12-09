package com.acme.subcomponents;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;

@Singleton
public class RequestRouter {

  private final Provider<RequestComponent.Builder> requestComponentProvider;

  @Inject
  RequestRouter(Provider<RequestComponent.Builder> requestComponentProvider) {
    this.requestComponentProvider = requestComponentProvider;
  }

  void dataReceived(Data data) {
    RequestComponent requestComponent =
        requestComponentProvider.get().requestModule(new RequestModule(data)).data(data).build();
    requestComponent.requestHandler().writeResponse(200, "hello, world");
  }
}
