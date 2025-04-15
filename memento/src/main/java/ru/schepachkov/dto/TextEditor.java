package ru.schepachkov.dto;

public class TextEditor {

    private String text;

    public Memento save() {
        return new Memento(text);
    }

    public void restore(Memento memento) {
        text = memento.getText();
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
