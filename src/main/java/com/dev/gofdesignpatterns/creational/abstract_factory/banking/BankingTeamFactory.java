package com.dev.gofdesignpatterns.creational.abstract_factory.banking;

import com.dev.gofdesignpatterns.creational.abstract_factory.Developer;
import com.dev.gofdesignpatterns.creational.abstract_factory.ProjectManager;
import com.dev.gofdesignpatterns.creational.abstract_factory.ProjectTeamFactory;
import com.dev.gofdesignpatterns.creational.abstract_factory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester createTester() {
        return new QATester();
    }

    @Override
    public ProjectManager createProjectManager() {
        return new BankingPM();
    }

}
