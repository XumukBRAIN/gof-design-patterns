package com.dev.gofdesignpatterns.behavioral.state;

import lombok.Setter;

@Setter
public class MusicPlayer {

    private PlayerState state;

    public MusicPlayer() {
        state = new StoppedState(); // Начальное состояние
    }

    public void play() {
        state.play(this);
    }

    public void pause() {
        state.pause(this);
    }

    public void stop() {
        state.stop(this);
    }

}

