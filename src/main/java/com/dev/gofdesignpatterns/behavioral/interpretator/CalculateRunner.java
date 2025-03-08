package com.dev.gofdesignpatterns.behavioral.interpretator;

public class CalculateRunner {

    public static void main(String[] args) {
        // Выражение: 5 + 3 - 2
        Expression expr = new Subtract(
                new Add(new Number(5), new Number(3)),
                new Number(2)
        );

        int result = expr.interpret();
        System.out.println("Результат: " + result); // Результат: 6
    }

}
