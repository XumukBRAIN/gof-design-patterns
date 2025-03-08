package com.dev.gofdesignpatterns.behavioral.template_method;

public abstract class Beverage {

    // Шаблонный метод
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    // Общие шаги
    private void boilWater() {
        System.out.println("Кипятим воду");
    }

    private void pourInCup() {
        System.out.println("Наливаем в чашку");
    }

    // Шаги, которые должны быть реализованы в подклассах
    protected abstract void brew(); // Заваривание
    protected abstract void addCondiments(); // Добавление добавок

}

