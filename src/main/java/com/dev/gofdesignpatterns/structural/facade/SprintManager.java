package com.dev.gofdesignpatterns.structural.facade;

import lombok.Getter;

@Getter
public class SprintManager {

    private boolean active;

    public void startSprint() {
        active = true;
        System.out.println("Sprint started");
    }

    public void stopSprint() {
        active = false;
        System.out.println("Sprint stopped");
    }
}
