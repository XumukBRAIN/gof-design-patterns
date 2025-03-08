package com.dev.gofdesignpatterns.behavioral.state;

public interface PlayerState {

    void play(MusicPlayer player);

    void pause(MusicPlayer player);

    void stop(MusicPlayer player);

}

