package ru.schepachkov;

import ru.schepachkov.command.Command;
import ru.schepachkov.command.ac.AcOff;
import ru.schepachkov.command.ac.AcOn;
import ru.schepachkov.command.light.LightOff;
import ru.schepachkov.command.light.LightOn;
import ru.schepachkov.dto.AirConditioner;
import ru.schepachkov.dto.HomeControl;
import ru.schepachkov.dto.Light;

public class Main {

    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        AirConditioner livingRoomAc = new AirConditioner();
        Command lightOn = new LightOn(livingRoomLight);
        Command lightOff = new LightOff(livingRoomLight);
        Command acOn = new AcOn(livingRoomAc);
        Command acOff = new AcOff(livingRoomAc);

        HomeControl homeControl = new HomeControl();
        homeControl.setCommand(lightOn);
        homeControl.executeCommand();

        homeControl.setCommand(acOn);
        homeControl.executeCommand();

        homeControl.setCommand(acOff);
        homeControl.executeCommand();

        homeControl.setCommand(lightOff);
        homeControl.executeCommand();
    }
}
