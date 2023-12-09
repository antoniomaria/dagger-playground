package com.acme.subcomponents2;

import javax.inject.Inject;

public class ApplicationMain {

  public ApplicationMain() {}

  @Inject Database database;

  public void run() {
    ApplicationComponent appComponent = DaggerApplicationComponent.create();
    appComponent.inject(this);
    System.out.println("Here you go  " + database);
    Database database = appComponent.database();
  }

  public static void main(String[] args) {
    new ApplicationMain().run();
  }
}
