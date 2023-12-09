package com.acme.subcomponents;

public class SubcomponentsMain {

  public static void main(String[] args) {
    RequestRouter requestRouter = DaggerServerComponent.create().requestRouter();

    requestRouter.dataReceived(new Data("My data"));
    requestRouter.dataReceived(new Data("hola hola"));
  }
}
