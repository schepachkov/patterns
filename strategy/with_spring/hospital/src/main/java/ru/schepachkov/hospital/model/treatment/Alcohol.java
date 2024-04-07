package ru.schepachkov.hospital.model.treatment;

import org.springframework.stereotype.Component;
import ru.schepachkov.hospital.model.patient.Patient;

@Component
public class Alcohol implements Treatment {

    @Override
    public void apply(Patient patient) {
        System.out.println("По 100 грамм водки после еды.");
    }
}
