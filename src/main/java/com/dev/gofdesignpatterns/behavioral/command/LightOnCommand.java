package com.dev.gofdesignpatterns.behavioral.command;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LightOnCommand implements Command {

    private final Light light;

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }

}
