package com.dev.gofdesignpatterns.structural.bridge;

public class Car extends Transport {

    public Car(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        System.out.println("Driving a car with " + engine.getType() + " engine!");
    }

}
