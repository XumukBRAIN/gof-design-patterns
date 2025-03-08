package com.dev.gofdesignpatterns.behavioral.visitor;

public class PrintVisitor implements Visitor {

    @Override
    public void visit(Button button) {
        System.out.println("Печатаем информацию о кнопке");
    }

    @Override
    public void visit(TextField textField) {
        System.out.println("Печатаем информацию о текстовом поле");
    }

}

