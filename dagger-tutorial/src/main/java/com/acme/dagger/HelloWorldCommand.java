package com.acme.dagger;

import javax.inject.Inject;
import java.util.List;

public class HelloWorldCommand implements Command{

    private final Outputter outputter;

    @Inject
    HelloWorldCommand(Outputter outputter){
        this.outputter = outputter;
    }
    @Override
    public String key() {
        return "hello";
    }

    @Override
    public Result handleInput(List<String> input) {
        if (!input.isEmpty()) {
            return Result.invalid();
        }
        System.out.println("world!");
        return Result.handled();
    }
}
