package ru.schepachkov.spring_way.dto;

public class Request {

    private int value;

    public Request(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
