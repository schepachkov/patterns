package ru.schepachkov.dto;

import ru.schepachkov.command.Command;

public class HomeControl {

    private Command command;

    public void executeCommand() {
        if (command != null) {
            command.execute();
        } else {
            System.out.println("Oops");
        }
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
