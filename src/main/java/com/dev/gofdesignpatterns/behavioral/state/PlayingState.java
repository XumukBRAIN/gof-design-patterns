package com.dev.gofdesignpatterns.behavioral.state;

public class PlayingState implements PlayerState {

    @Override
    public void play(MusicPlayer player) {
        System.out.println("Музыка уже воспроизводится.");
    }

    @Override
    public void pause(MusicPlayer player) {
        System.out.println("Музыка приостановлена.");
        player.setState(new PausedState());
    }

    @Override
    public void stop(MusicPlayer player) {
        System.out.println("Музыка остановлена.");
        player.setState(new StoppedState());
    }

}

