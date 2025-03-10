package com.dev.gofdesignpatterns.creational.abstract_factory.banking;

import com.dev.gofdesignpatterns.creational.abstract_factory.ProjectManager;

public class BankingPM implements ProjectManager {

    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }

}
