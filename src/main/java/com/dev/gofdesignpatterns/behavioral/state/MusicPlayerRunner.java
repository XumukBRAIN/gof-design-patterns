package com.dev.gofdesignpatterns.behavioral.state;

public class MusicPlayerRunner {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();

        musicPlayer.play(); // Начало воспроизведения музыки.
        musicPlayer.pause(); // Музыка приостановлена.
        musicPlayer.stop(); // Музыка остановлена.

        musicPlayer.play(); // Начало воспроизведения музыки.
        musicPlayer.stop(); // Музыка остановлена.

        musicPlayer.pause(); // Нельзя приостановить музыку, она не воспроизводится.

        musicPlayer.play(); // Начало воспроизведения музыки.
        musicPlayer.stop(); // Музыка остановлена.

        musicPlayer.pause(); // Нельзя приостановить музыку, она не воспроизводится.

        musicPlayer.stop(); // Музыка уже остановлена.
    }
}
