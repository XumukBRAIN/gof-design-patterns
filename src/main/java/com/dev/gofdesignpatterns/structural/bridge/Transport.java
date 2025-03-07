package com.dev.gofdesignpatterns.structural.bridge;

public abstract class Transport {

    protected Engine engine;

    public Transport(Engine engine) {
        this.engine = engine;
    }

    public abstract void drive();

}
