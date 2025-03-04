package com.dev.gofdesignpatterns.creational.abstract_factory.website;

import com.dev.gofdesignpatterns.creational.abstract_factory.Developer;
import com.dev.gofdesignpatterns.creational.abstract_factory.ProjectManager;
import com.dev.gofdesignpatterns.creational.abstract_factory.ProjectTeamFactory;
import com.dev.gofdesignpatterns.creational.abstract_factory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester createTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager createProjectManager() {
        return new WebsitePM();
    }

}
