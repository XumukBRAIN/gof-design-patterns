package com.dev.gofdesignpatterns.structural.flyweight;

public class ProjectRunner {

    public static void main(String[] args) {
        DeveloperFactory factory = new DeveloperFactory();

        factory.getDeveloper("Java")
                .writeCode();
        factory.getDeveloper("Java")
                .writeCode();
        factory.getDeveloper("Java")
                .writeCode();

        factory.getDeveloper("Python")
                .writeCode();
        factory.getDeveloper("Python")
                .writeCode();
        factory.getDeveloper("Python")
                .writeCode();
    }

}
