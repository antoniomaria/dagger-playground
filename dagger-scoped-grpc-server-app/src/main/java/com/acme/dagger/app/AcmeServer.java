package com.acme.dagger.app;

import io.grpc.Server;

import java.io.IOException;

abstract  class AcmeServer {
    protected abstract Server server();

    public void start() throws IOException {
        server().start();
    }

    public void shutdown() {
        server().shutdownNow();
    }

    public void awaitTermination() throws InterruptedException {
        server().awaitTermination();
    }

}
