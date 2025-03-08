package com.dev.gofdesignpatterns.behavioral.visitor;

public interface Visitor {

    void visit(Button button);

    void visit(TextField textField);

}

