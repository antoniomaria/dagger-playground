package com.acme.dagger.app;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

import javax.inject.Inject;
import java.io.IOException;

public class ApplicationMain {

    // Dependency injected by appComponent.inject(this)
    @Inject
    AcmeServer server;

    public void run() throws IOException, InterruptedException {
        Config config = ConfigFactory.load();

        ApplicationComponent appComponent = DaggerApplicationComponent.builder().appModule(new AppModule(config)).build();

        appComponent.inject(this);

        server.start();

        System.out.println("serving");

        server.awaitTermination();
    }

    public static void main(String[] args) {
        // Seeen in
        // https://github.com/elye/demo_android_dagger_subcomponents_kotlin/blob/397d9c24169c78365047e77e5246fd4e61b935ec/app/src/main/java/com/elyeproj/daggertwosubcomponent/subcomponentforencapsulation/notencapsulate/NonEncapsulation.kt#L29
// https://github.com/google/dagger/blob/master/javatests/dagger/grpc/functional/server/CoffeeServerWithUnscopedService.java

        try {
            new ApplicationMain().run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
