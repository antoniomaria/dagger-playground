package com.acme.subcomponents;


import dagger.Module;
import dagger.Provides;

@Module
public class RequestModule {

    Data data;
    public RequestModule(){

    }
    public RequestModule(Data data){
        this.data = data;
        System.out.println("Request Module created");
    }


    @Provides
    static RequestHandler getRequestHandler(Data data) {
        return new RequestHandler(data);
    }
}
