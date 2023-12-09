package com.acme.subcomponents;

public class RequestHandler {

    public RequestHandler(Data data){

    }

    public RequestHandler(){

    }

    public void writeResponse(int code, String content){
        System.out.println("Sending " + code + " " + content);
    }

}
