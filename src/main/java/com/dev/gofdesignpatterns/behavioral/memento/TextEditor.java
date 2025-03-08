package com.dev.gofdesignpatterns.behavioral.memento;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TextEditor {

    private String text;

    // Создание снимка
    public TextMemento save() {
        return new TextMemento(text);
    }

    // Восстановление состояния
    public void restore(TextMemento memento) {
        this.text = memento.getText();
    }

}
