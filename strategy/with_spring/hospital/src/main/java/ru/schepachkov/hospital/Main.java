package ru.schepachkov.hospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.schepachkov.hospital.model.doctor.HealingMethod;
import ru.schepachkov.hospital.model.patient.Patient;
import ru.schepachkov.hospital.service.Hospital;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
        Hospital hospital = context.getBean(Hospital.class);
        hospital.healing(new Patient("Olesya", HealingMethod.TRADITIONAL));
        System.out.println();
        hospital.healing(new Patient("Maya", HealingMethod.FOLK));
        System.out.println();
        hospital.healing(new Patient("Nastya", HealingMethod.MAGIC));
        System.out.println();
        System.out.println("END");
    }
}
