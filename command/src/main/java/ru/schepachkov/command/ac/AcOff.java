package ru.schepachkov.command.ac;

import ru.schepachkov.command.Command;
import ru.schepachkov.dto.AirConditioner;

public class AcOff implements Command {

    private AirConditioner ac;

    public AcOff(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOff();
    }
}
