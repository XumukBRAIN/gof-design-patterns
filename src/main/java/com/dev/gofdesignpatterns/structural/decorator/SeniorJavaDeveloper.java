package com.dev.gofdesignpatterns.structural.decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator {

    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview() {
        return "Make code review...\n";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }

}
