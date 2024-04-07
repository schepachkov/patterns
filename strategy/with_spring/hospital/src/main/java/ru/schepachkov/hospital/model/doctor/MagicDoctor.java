package ru.schepachkov.hospital.model.doctor;

import org.springframework.stereotype.Component;
import ru.schepachkov.hospital.model.patient.Patient;

@Component
public class MagicDoctor implements Healing {


    @Override
    public void heal(Patient patient) {
        greeting(patient);
        System.out.println("Ахалай махалай.");
    }

    @Override
    public HealingMethod getType() {
        return HealingMethod.MAGIC;
    }
}
