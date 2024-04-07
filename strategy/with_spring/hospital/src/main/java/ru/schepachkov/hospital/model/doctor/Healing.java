package ru.schepachkov.hospital.model.doctor;

import ru.schepachkov.hospital.model.patient.Patient;

public interface Healing {

    void heal(Patient patient);
    HealingMethod getType();

    default void greeting(Patient patient) {
        System.out.println(String.format("Привет, %s!", patient.getName()));
    }
}
