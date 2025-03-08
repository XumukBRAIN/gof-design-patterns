package com.dev.gofdesignpatterns.behavioral.state;

public class PausedState implements PlayerState {

    @Override
    public void play(MusicPlayer player) {
        System.out.println("Возобновление воспроизведения музыки.");
        player.setState(new PlayingState());
    }

    @Override
    public void pause(MusicPlayer player) {
        System.out.println("Музыка уже приостановлена.");
    }

    @Override
    public void stop(MusicPlayer player) {
        System.out.println("Музыка остановлена.");
        player.setState(new StoppedState());
    }

}

