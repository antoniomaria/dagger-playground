package com.acme.dagger.app;

import io.grpc.Server;

public class GrpcWrapper {

  private Server server;

  public GrpcWrapper(Server server) {
    this.server = server;
  }

  public Server getServer() {
    return server;
  }
}
