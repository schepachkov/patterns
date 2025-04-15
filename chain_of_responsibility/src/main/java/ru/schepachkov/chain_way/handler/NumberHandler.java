package ru.schepachkov.chain_way.handler;

import ru.schepachkov.chain_way.dto.Request;

public class NumberHandler implements Handle {

    private Handle nextHandle;

    @Override
    public void setNextHandle(Handle handle) {
        nextHandle = handle;
    }

    @Override
    public HandleType getType() {
        return HandleType.NUMBER;
    }

    @Override
    public void handle(Request request) {
        if (request.getType() == getType()) {
            System.out.println("You pass a number " + request.getValue());
        } else {
            if (nextHandle != null) {
                nextHandle.handle(request);
            } else {
                System.out.println("Oops");
            }
        }
    }
}
