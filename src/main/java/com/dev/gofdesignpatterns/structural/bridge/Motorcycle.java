package com.dev.gofdesignpatterns.structural.bridge;

public class Motorcycle extends Transport {

    public Motorcycle(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        System.out.println("Driving a motorcycle with " + engine.getType() + " engine!");
    }

}
