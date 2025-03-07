package com.dev.gofdesignpatterns.structural.proxy;

public class ProxyObject implements Project {

    private final String URL;

    private RealProject realProject;

    public ProxyObject(String url) {
        URL = url;
    }

    @Override
    public void run() {
        if (realProject == null) {
            realProject = new RealProject(URL);
        }

        realProject.run();
    }

}
