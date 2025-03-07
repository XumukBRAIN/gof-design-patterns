package com.dev.gofdesignpatterns.structural.decorator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DeveloperDecorator implements Developer {

    private final Developer developer;

    @Override
    public String makeJob() {
        return developer.makeJob();
    }

}
