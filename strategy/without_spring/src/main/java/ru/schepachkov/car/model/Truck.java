package ru.schepachkov.car.model;

import ru.schepachkov.car.fill.FillStrategy;
import ru.schepachkov.car.fill.StandartFillStrategy;

public class Truck extends Car {

    public Truck() {
        super(new StandartFillStrategy());
    }
}
