package ru.schepachkov.hospital.model.treatment;

import org.springframework.stereotype.Component;
import ru.schepachkov.hospital.model.patient.Patient;

@Component
public class Pills implements Treatment {

    @Override
    public void apply(Patient patient) {
        System.out.println("Принимайте таблетки - одну-две, после обеда по полтора, на тощак, перед сном, рассостать, не запивать, голубей не гонять, в старости не ворчать.");
    }
}
