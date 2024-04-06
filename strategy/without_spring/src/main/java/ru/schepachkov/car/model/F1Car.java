package ru.schepachkov.car.model;

import ru.schepachkov.car.fill.F1PitstopStrategy;
import ru.schepachkov.car.fill.FillStrategy;

public class F1Car extends Car {


    public F1Car() {
        super(new F1PitstopStrategy());
    }
}
