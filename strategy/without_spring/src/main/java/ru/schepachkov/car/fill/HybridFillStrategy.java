package ru.schepachkov.car.fill;

public class HybridFillStrategy implements FillStrategy {


    @Override
    public void fill() {
        System.out.println("Заправляем бензином или электричеством на выбор!");
    }
}
