package ru.schepachkov.observable;

import ru.schepachkov.dto.TemperatureDto;
import ru.schepachkov.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class TemperatureObservable {

    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notify(TemperatureDto dto) {
        observers.forEach(observer -> observer.updateTemperature(dto));
    }
}
