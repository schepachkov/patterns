package ru.schepachkov;

import ru.schepachkov.dto.Memento;
import ru.schepachkov.dto.TextEditor;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Memento> textStates = new ArrayList<>();
        TextEditor textEditor = new TextEditor();
        textEditor.setText("first text");
        textStates.add(textEditor.save());
        textEditor.setText("second text");
        textStates.add(textEditor.save());

        System.out.println("Current text = " + textEditor.getText());
        textEditor.restore(textStates.get(0));
        System.out.println("Current text = " + textEditor.getText());
    }
}
