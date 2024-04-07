package ru.schepachkov.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.schepachkov.hospital.model.doctor.HealingMethod;
import ru.schepachkov.hospital.model.patient.Patient;
import ru.schepachkov.hospital.model.doctor.Healing;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class HospitalImpl implements Hospital {

    private Map<HealingMethod, Healing> healthApproaches;

    @Autowired
    public HospitalImpl(List<Healing> healings) {
        healthApproaches = healings.stream().collect(Collectors.toMap(Healing::getType, Function.identity()));
    }

    @Override
    public void healing(Patient patient) {
        Healing doctor = healthApproaches.get(patient.getMethod());
        if (doctor != null) {
            doctor.heal(patient);
        } else {
            System.out.println("Такого врача нет в системе.");
        }
    }
}
