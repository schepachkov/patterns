package ru.schepachkov.command.light;

import ru.schepachkov.command.Command;
import ru.schepachkov.dto.Light;

public class LightOn implements Command {

    private Light light;

    public LightOn(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
