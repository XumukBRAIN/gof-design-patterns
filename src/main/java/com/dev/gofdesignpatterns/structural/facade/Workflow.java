package com.dev.gofdesignpatterns.structural.facade;

/**
 * Этот класс является фасадом для взаимодействия клиента с программной частью проекта
 */
public class Workflow {

    private final Job job = new Job();
    private final Developer developer = new Developer();
    private final SprintManager sprintManager = new SprintManager();

    public void startWorkflow() {
        job.doJob();
        sprintManager.startSprint();
        developer.doJobBeforeDeadline(sprintManager);
        sprintManager.stopSprint();
        developer.doJobBeforeDeadline(sprintManager);
    }

}
