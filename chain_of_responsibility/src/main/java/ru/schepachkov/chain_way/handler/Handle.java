package ru.schepachkov.chain_way.handler;

import ru.schepachkov.chain_way.dto.Request;

public interface Handle {

    void setNextHandle(Handle handle);

    HandleType getType();

    void handle(Request request);
}
