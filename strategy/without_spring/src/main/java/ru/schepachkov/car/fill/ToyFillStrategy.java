package ru.schepachkov.car.fill;

public class ToyFillStrategy implements FillStrategy {


    @Override
    public void fill() {
        System.out.println("Кончается топливо! Нужно заехать на игрушечную заправку!");
    }
}
