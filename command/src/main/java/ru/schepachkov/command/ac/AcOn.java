package ru.schepachkov.command.ac;

import ru.schepachkov.command.Command;
import ru.schepachkov.dto.AirConditioner;

public class AcOn implements Command {

    private AirConditioner ac;

    public AcOn(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOn();
    }
}
