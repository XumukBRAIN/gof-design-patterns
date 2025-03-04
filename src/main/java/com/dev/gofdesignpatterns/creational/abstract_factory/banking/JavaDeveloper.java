package com.dev.gofdesignpatterns.creational.abstract_factory.banking;

import com.dev.gofdesignpatterns.creational.abstract_factory.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Java Developer writes Java code...");
    }

}
