package ru.schepachkov.hospital.model.doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.schepachkov.hospital.model.patient.Patient;
import ru.schepachkov.hospital.infrastructure.treatment.InjectTreatments;
import ru.schepachkov.hospital.model.treatment.Alcohol;
import ru.schepachkov.hospital.model.treatment.Treatment;

import java.util.List;

@Component
public class FolkDoctor implements Healing {

    @Autowired
    @InjectTreatments({Alcohol.class})
    private List<Treatment> treatments;

    @Override
    public void heal(Patient patient) {
        greeting(patient);
        System.out.println("Над картошкой подыши, потом водкой продезенфицируйся.");
        treatments.forEach(t -> t.apply(patient));
    }

    @Override
    public HealingMethod getType() {
        return HealingMethod.FOLK;
    }
}
