package com.dev.gofdesignpatterns.behavioral.observer;

public class StatisticsDisplay implements Observer {

    private float maxTemperature = Float.MIN_VALUE;
    private float minTemperature = Float.MAX_VALUE;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        if (temperature > maxTemperature) {
            maxTemperature = temperature;
        }
        if (temperature < minTemperature) {
            minTemperature = temperature;
        }
        display();
    }

    public void display() {
        System.out.println("Максимальная температура: " + maxTemperature + "°C");
        System.out.println("Минимальная температура: " + minTemperature + "°C");
    }

}
