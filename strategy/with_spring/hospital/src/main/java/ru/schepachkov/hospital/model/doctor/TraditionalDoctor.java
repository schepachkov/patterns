package ru.schepachkov.hospital.model.doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.schepachkov.hospital.model.patient.Patient;
import ru.schepachkov.hospital.infrastructure.treatment.InjectTreatments;
import ru.schepachkov.hospital.model.treatment.Pills;
import ru.schepachkov.hospital.model.treatment.Syrup;
import ru.schepachkov.hospital.model.treatment.Treatment;

import java.util.List;

@Component
public class TraditionalDoctor implements Healing {

    @Autowired
    @InjectTreatments({Pills.class, Syrup.class})
    private List<Treatment> treatments;

    @Override
    public void heal(Patient patient) {
        greeting(patient);
        System.out.println("Скажите А, скажите Б. Можете одеваться.");
        treatments.forEach(t -> t.apply(patient));
    }

    @Override
    public HealingMethod getType() {
        return HealingMethod.TRADITIONAL;
    }
}
