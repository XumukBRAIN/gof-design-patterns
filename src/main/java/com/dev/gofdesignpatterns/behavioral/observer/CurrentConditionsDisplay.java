package com.dev.gofdesignpatterns.behavioral.observer;

public class CurrentConditionsDisplay implements Observer {

    private float temperature;
    private float humidity;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Текущие условия: " + temperature + "°C и " + humidity + "% влажности.");
    }

}
