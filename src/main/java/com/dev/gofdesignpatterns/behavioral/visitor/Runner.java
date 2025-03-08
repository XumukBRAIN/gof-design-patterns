package com.dev.gofdesignpatterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Element> elements = new ArrayList<>();
        elements.add(new Button());
        elements.add(new TextField());

        // Создаем посетителей
        Visitor renderVisitor = new RenderVisitor();
        Visitor printVisitor = new PrintVisitor();

        // Используем посетителей для обхода элементов
        for (Element element : elements) {
            element.accept(renderVisitor);
            element.accept(printVisitor);
            System.out.println();
        }
    }
}
