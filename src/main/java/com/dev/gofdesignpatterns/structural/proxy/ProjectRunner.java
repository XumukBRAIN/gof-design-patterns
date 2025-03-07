package com.dev.gofdesignpatterns.structural.proxy;

public class ProjectRunner {

    public static void main(String[] args) {
        Project project = new ProxyObject("https://www.github.com/dev/real-project");
        project.run();
    }

}
