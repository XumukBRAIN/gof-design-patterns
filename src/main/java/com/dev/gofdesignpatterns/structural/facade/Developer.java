package com.dev.gofdesignpatterns.structural.facade;

public class Developer {

    public void doJobBeforeDeadline(SprintManager sprintManager) {
        if (sprintManager.isActive()) {
            System.out.println("Developer starts working on the task");
        } else {
            System.out.println("Sprint is not active, developer cannot start working");
        }
    }

}
