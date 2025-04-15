package ru.schepachkov.chain_way;

import ru.schepachkov.chain_way.dto.Request;
import ru.schepachkov.chain_way.handler.Handle;
import ru.schepachkov.chain_way.handler.HandleType;
import ru.schepachkov.chain_way.handler.NumberHandler;
import ru.schepachkov.chain_way.handler.StringHandler;

public class Main {

    public static void main(String[] args) {
        Handle handler1 = new NumberHandler();
        Handle handler2 = new StringHandler();
        handler1.setNextHandle(handler2);
        handler1.handle(new Request(HandleType.NUMBER, 1));
        handler1.handle(new Request(HandleType.STRING, "hi all"));
    }
}
