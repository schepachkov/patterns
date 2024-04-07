package ru.schepachkov.hospital.model.patient;

import ru.schepachkov.hospital.model.doctor.HealingMethod;

public class Patient {

    private HealingMethod method;
    private String name;

    public Patient(String name, HealingMethod method) {
        this.name = name;
        this.method = method;
    }

    public HealingMethod getMethod() {
        return method;
    }

    public void setMethod(HealingMethod method) {
        this.method = method;
    }

    public String getName() {
        return name;
    }
}
