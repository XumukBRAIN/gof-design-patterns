package com.dev.gofdesignpatterns.structural.proxy;

public class RealProject implements Project {

    private final String URL;

    public RealProject(String URL) {
        this.URL = URL;
        load();
    }

    public void load() {
        System.out.println("Loading project from + " + URL + " ...");
    }

    @Override
    public void run() {
        System.out.println("Running project... + " + URL + " ...");
    }

}
