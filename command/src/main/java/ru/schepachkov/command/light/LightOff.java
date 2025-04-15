package ru.schepachkov.command.light;

import ru.schepachkov.command.Command;
import ru.schepachkov.dto.Light;

public class LightOff implements Command {

    private Light light;

    public LightOff(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
