package com.acme.dagger;

import com.acme.dagger.Command.Result;

import java.util.Scanner;

public class CommandLineAtm {

  public static void main(String[] args) {
    System.out.println("Show begins");

    Scanner scanner = new Scanner(System.in);

    CommandRouterFactory commandRouterFactory = DaggerCommandRouterFactory.create();

    CommandRouter commandRouter = commandRouterFactory.router();

    while (scanner.hasNextLine()) {
      Result unused = commandRouter.route(scanner.nextLine());
    }

    System.out.println("There you go");
  }
}
