package ru.schepachkov.car.model;

import ru.schepachkov.car.fill.FillStrategy;

public abstract class Car {

    private FillStrategy fillStrategy;

    public Car(FillStrategy fillStrategy) {
        this.fillStrategy = fillStrategy;
    }

    public void gas() {
        System.out.println("Едем вперед");
    }

    public void stop() {
        System.out.println("Тормозим!");
    }

    public void fill() {
        fillStrategy.fill();
    }
}
