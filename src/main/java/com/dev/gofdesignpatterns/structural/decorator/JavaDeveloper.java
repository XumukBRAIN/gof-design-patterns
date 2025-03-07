package com.dev.gofdesignpatterns.structural.decorator;

public class JavaDeveloper implements Developer {

    @Override
    public String makeJob() {
        return "Java Developer writes code...\n";
    }

}
