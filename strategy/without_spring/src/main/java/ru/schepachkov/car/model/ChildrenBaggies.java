package ru.schepachkov.car.model;

import ru.schepachkov.car.fill.ToyFillStrategy;

public class ChildrenBaggies extends Car {

    public ChildrenBaggies() {
        super(new ToyFillStrategy());
    }
}
