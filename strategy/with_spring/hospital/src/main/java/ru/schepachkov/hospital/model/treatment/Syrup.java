package ru.schepachkov.hospital.model.treatment;

import org.springframework.stereotype.Component;
import ru.schepachkov.hospital.model.patient.Patient;

@Component
public class Syrup implements Treatment {


    @Override
    public void apply(Patient patient) {
        System.out.println("Выпиваем сироп 3 раза в день после еды.");
    }
}
