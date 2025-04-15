package ru.schepachkov.observer;

import ru.schepachkov.dto.TemperatureDto;

public class TvObserver implements Observer {


    @Override
    public void updateTemperature(TemperatureDto dto) {
        System.out.println("Пора обновить температуру на экране! " + dto);
    }
}
