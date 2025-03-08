package com.dev.gofdesignpatterns.behavioral.command;

public class CommandRunner {
    public static void main(String[] args) {
        // Устройства
        Light livingRoomLight = new Light();
        MusicPlayer player = new MusicPlayer();

        // Команды
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command musicPlay = new MusicPlayCommand(player);

        // Пульт
        RemoteControl remote = new RemoteControl();

        // Управляем светом
        remote.setCommand(lightOn);
        remote.pressButton(); // Свет включен
        remote.pressUndo();   // Свет выключен

        // Управляем музыкой
        remote.setCommand(musicPlay);
        remote.pressButton(); // Музыка включена
        remote.pressUndo();   // Музыка выключена
    }
}
