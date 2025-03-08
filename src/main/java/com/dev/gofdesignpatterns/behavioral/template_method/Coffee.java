package com.dev.gofdesignpatterns.behavioral.template_method;

public class Coffee extends Beverage {

    @Override
    protected void brew() {
        System.out.println("Завариваем кофейные зерна");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Добавляем сахар и молоко");
    }

}

