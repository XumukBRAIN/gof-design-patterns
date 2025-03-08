package com.dev.gofdesignpatterns.behavioral.command;

import lombok.Setter;

public class RemoteControl {

    @Setter
    private Command command;
    private Command lastCommand; // Для отмены

    public void pressButton() {
        command.execute();
        lastCommand = command;
    }

    public void pressUndo() {
        if (lastCommand != null) {
            lastCommand.undo();
            lastCommand = null;
        }
    }

}

