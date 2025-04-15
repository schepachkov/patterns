package ru.schepachkov.chain_way.handler;

import ru.schepachkov.chain_way.dto.Request;

public class StringHandler implements Handle {

    private Handle nextHandle;

    @Override
    public void setNextHandle(Handle handle) {
        nextHandle = handle;
    }

    @Override
    public HandleType getType() {
        return HandleType.STRING;
    }

    @Override
    public void handle(Request request) {
        if (request.getType() == getType()) {
            System.out.println("You pass a string " + request.getValue());
        } else {
            if (nextHandle != null) {
                nextHandle.handle(request);
            } else {
                System.out.println("Oops");
            }
        }
    }
}
