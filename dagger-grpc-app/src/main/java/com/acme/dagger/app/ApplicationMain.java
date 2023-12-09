package com.acme.dagger.app;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import dagger.grpc.server.NettyServerModule;
import io.grpc.Server;

import java.io.IOException;

public class ApplicationMain {

    public ApplicationMain() {

    }

    //@Inject
    //Database database;
    public void run() throws IOException, InterruptedException {

        Config config = ConfigFactory.load();

        ApplicationComponent appComponent = DaggerApplicationComponent.builder().appModule(new AppModule(config)).build();

        NettyServerModule nettyServerModule = NettyServerModule.bindingToPort(9090);

        //GrpcWrapper wrapper = appComponent.server();

        //MyGrpcComponent grcpComponent = appComponent.grpcComponent().nettyServerModule(nettyServerModule).build();

        //Server server = grcpComponent.server();

        //server.start();
        Server server = appComponent.server();

        server.start();

        System.out.println("serving");

        server.awaitTermination();

        //appComponent.inject(this);

        //System.out.println("the winner is  " + database);
        //Database database = appComponent.database();


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
