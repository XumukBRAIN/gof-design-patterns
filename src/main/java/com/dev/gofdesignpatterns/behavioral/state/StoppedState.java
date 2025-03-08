package com.dev.gofdesignpatterns.behavioral.state;

public class StoppedState implements PlayerState {

    @Override
    public void play(MusicPlayer player) {
        System.out.println("Начало воспроизведения музыки.");
        player.setState(new PlayingState());
    }

    @Override
    public void pause(MusicPlayer player) {
        System.out.println("Нельзя приостановить музыку, она не воспроизводится.");
    }

    @Override
    public void stop(MusicPlayer player) {
        System.out.println("Музыка уже остановлена.");
    }

}

