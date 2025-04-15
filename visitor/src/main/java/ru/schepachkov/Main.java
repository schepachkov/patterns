package ru.schepachkov;

import ru.schepachkov.dto.Doctor;
import ru.schepachkov.dto.HeartDoctor;
import ru.schepachkov.dto.Patient;
import ru.schepachkov.dto.TeethDoctor;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Doctor> doctors = new ArrayList<>();
        doctors.add(new HeartDoctor());
        doctors.add(new TeethDoctor());

        Patient patient = new Patient();

        doctors.forEach(doctor -> doctor.accept(patient));
    }
}
