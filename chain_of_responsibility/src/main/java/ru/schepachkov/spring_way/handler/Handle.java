package ru.schepachkov.spring_way.handler;

import ru.schepachkov.spring_way.dto.Request;
import ru.schepachkov.spring_way.dto.Result;

public interface Handle {

    void execute(Request request, Result result);


}
