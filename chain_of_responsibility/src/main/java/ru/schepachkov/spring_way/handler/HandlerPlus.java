package ru.schepachkov.spring_way.handler;

import ru.schepachkov.spring_way.dto.Request;
import ru.schepachkov.spring_way.dto.Result;

public class HandlerPlus implements Handle {


    @Override
    public void execute(Request request, Result result) {
        result.setResult(result.getResult() + request.getValue());
    }
}
