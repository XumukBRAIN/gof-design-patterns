package com.dev.gofdesignpatterns.structural.bridge;

/**
 * Паттерн Bridge (Мост) — это структурный паттерн проектирования,
 * который позволяет разделить абстракцию и реализацию так,
 * чтобы они могли изменяться независимо друг от друга.
 */
public class DriverClient {

    public static void main(String[] args) {
        Engine gasEngine = new GasolineEngine();
        Engine disEngine = new DieselEngine();

        Car gasCar = new Car(gasEngine);
        Car disCar = new Car(disEngine);
        Motorcycle gasMotorcycle = new Motorcycle(gasEngine);

        gasCar.drive();
        gasMotorcycle.drive();
        disCar.drive();
    }

}
