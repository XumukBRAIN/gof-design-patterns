package com.dev.gofdesignpatterns.creational.prototype;

public record ProjectFactory(Project project) {

    Project cloneProject() {
        return (Project) project.copy();
    }

}
