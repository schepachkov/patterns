package ru.schepachkov.spring_way;

import ru.schepachkov.spring_way.dto.Request;
import ru.schepachkov.spring_way.dto.Result;
import ru.schepachkov.spring_way.handler.Handle;
import ru.schepachkov.spring_way.handler.HandlerMinus;
import ru.schepachkov.spring_way.handler.HandlerPlus;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Handle> handlers = new ArrayList<>();
        handlers.add(new HandlerPlus());
        handlers.add(new HandlerPlus());
        handlers.add(new HandlerPlus());
        handlers.add(new HandlerMinus());
        Result result = new Result();
        handlers.forEach(h -> h.execute(new Request(5), result));
        System.out.println(result.getResult());
    }
}
