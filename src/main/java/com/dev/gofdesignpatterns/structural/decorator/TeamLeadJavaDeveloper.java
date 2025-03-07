package com.dev.gofdesignpatterns.structural.decorator;

public class TeamLeadJavaDeveloper extends DeveloperDecorator {

    public TeamLeadJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String sentWeekReport() {
        return "Sending report to customer...\n";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sentWeekReport();
    }

}
