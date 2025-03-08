package com.dev.gofdesignpatterns.behavioral.visitor;

public class RenderVisitor implements Visitor {

    @Override
    public void visit(Button button) {
        System.out.println("Рендерим кнопку");
        button.click();
    }

    @Override
    public void visit(TextField textField) {
        System.out.println("Рендерим текстовое поле");
        textField.type("Пример текста");
    }

}

