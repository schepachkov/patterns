package ru.schepachkov.observer;

import ru.schepachkov.dto.TemperatureDto;

public class RadioObserver implements Observer {


    @Override
    public void updateTemperature(TemperatureDto dto) {
        System.out.println("Пора рассказать об изменении температуры! " + dto);
    }
}
