package com.dev.gofdesignpatterns.behavioral.visitor;

public class TextField implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void type(String text) {
        System.out.println("Введено: " + text);
    }

}

