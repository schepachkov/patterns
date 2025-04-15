package ru.schepachkov.dto;

public class Patient {

    public void visit(HeartDoctor doctor) {
        System.out.printf("Мне проверили сердце за '%s' рублей.\n", doctor.getCost());
    }

    public void visit(TeethDoctor doctor) {
        System.out.printf("Мне проверили зубы за '%s' рублей.\n", doctor.getCost());
    }
}
