package ru.schepachkov.observer;

import ru.schepachkov.dto.TemperatureDto;

public interface Observer {

    void updateTemperature(TemperatureDto dto);
}
