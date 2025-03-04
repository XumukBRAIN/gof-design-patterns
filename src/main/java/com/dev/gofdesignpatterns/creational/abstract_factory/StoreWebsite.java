package com.dev.gofdesignpatterns.creational.abstract_factory;

import com.dev.gofdesignpatterns.creational.abstract_factory.website.WebsiteTeamFactory;

public class StoreWebsite {

    public static void main(String[] args) {
        ProjectTeamFactory factory = new WebsiteTeamFactory();
        Developer developer = factory.createDeveloper();
        Tester tester = factory.createTester();
        ProjectManager projectManager = factory.createProjectManager();

        System.out.println("Creating project...");

        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }

}
