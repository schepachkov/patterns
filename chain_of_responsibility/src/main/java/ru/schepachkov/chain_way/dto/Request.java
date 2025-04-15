package ru.schepachkov.chain_way.dto;

import ru.schepachkov.chain_way.handler.HandleType;

public class Request {

    private HandleType type;
    private Object value;

    public Request(HandleType type, Object value) {
        this.type = type;
        this.value = value;
    }

    public HandleType getType() {
        return type;
    }

    public void setType(HandleType type) {
        this.type = type;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
