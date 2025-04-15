package ru.schepachkov.dto;

public class TemperatureDto {

    private double temperature;

    public TemperatureDto(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return String.format("Температура '%s' по Цельсию", temperature);
    }
}
