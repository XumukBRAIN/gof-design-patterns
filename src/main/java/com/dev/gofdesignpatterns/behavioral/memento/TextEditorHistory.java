package com.dev.gofdesignpatterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class TextEditorHistory {

    private final List<TextMemento> history = new ArrayList<>();

    public void save(TextEditor editor) {
        history.add(editor.save());
    }

    public void restore(TextEditor editor, int index) {
        if (index >= 0 && index < history.size()) {
            editor.restore(history.get(index));
        }
    }

}
