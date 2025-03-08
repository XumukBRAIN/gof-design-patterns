package com.dev.gofdesignpatterns.behavioral.memento;

public class TextBufferRunner {

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        TextEditorHistory history = new TextEditorHistory();

        // Изменения в тексте
        editor.setText("Version 1");
        history.save(editor);

        editor.setText("Version 2");
        history.save(editor);

        editor.setText("Version 3");

        System.out.println("Current Text: " + editor.getText()); // Version 3

        // Восстановление к предыдущей версии
        history.restore(editor, 1);

        System.out.println("Restored Text: " + editor.getText()); // Version 2

        // Восстановление к первой версии
        history.restore(editor, 0);

        System.out.println("Restored Text: " + editor.getText()); // Version 1
    }

}
