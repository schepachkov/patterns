package ru.schepachkov.car.model;

import ru.schepachkov.car.fill.HybridFillStrategy;

public class Sedan extends Car {


    public Sedan() {
        super(new HybridFillStrategy());
    }
}
