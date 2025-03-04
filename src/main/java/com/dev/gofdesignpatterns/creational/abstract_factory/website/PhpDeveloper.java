package com.dev.gofdesignpatterns.creational.abstract_factory.website;

import com.dev.gofdesignpatterns.creational.abstract_factory.Developer;

public class PhpDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("PHP Developer writes PHP code...");
    }

}
