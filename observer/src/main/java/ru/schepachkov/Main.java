package ru.schepachkov;

import ru.schepachkov.dto.TemperatureDto;
import ru.schepachkov.observable.TemperatureObservable;
import ru.schepachkov.observer.RadioObserver;
import ru.schepachkov.observer.TvObserver;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        TemperatureObservable observable = new TemperatureObservable();
        observable.attach(new TvObserver());
        observable.attach(new RadioObserver());
        observable.notify(new TemperatureDto(23));
        Thread.sleep(3000L);
        observable.notify(new TemperatureDto(25));
    }
}
