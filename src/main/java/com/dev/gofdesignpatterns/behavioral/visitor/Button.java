package com.dev.gofdesignpatterns.behavioral.visitor;

public class Button implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void click() {
        System.out.println("Кнопка нажата");
    }

}

