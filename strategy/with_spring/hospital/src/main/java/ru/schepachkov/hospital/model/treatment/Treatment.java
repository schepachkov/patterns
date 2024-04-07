package ru.schepachkov.hospital.model.treatment;

import ru.schepachkov.hospital.model.patient.Patient;

public interface Treatment {

    void apply(Patient patient);
}
