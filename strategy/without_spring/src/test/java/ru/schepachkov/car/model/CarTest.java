package ru.schepachkov.car.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void carTest() {
        Sedan sedan = new Sedan();
        Truck truck = new Truck();
        F1Car f1Car = new F1Car();
        ChildrenBaggies childrenBaggies = new ChildrenBaggies();

        sedan.fill();
        truck.fill();
        f1Car.fill();
        childrenBaggies.fill();
    }

}