package com.dev.gofdesignpatterns.behavioral.command;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MusicPlayCommand implements Command {

    private final MusicPlayer musicPlayer;

    @Override
    public void execute() {
        musicPlayer.play();
    }

    @Override
    public void undo() {
        musicPlayer.stop();
    }
}

