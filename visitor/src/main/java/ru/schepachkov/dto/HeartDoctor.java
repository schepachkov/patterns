package ru.schepachkov.dto;

public class HeartDoctor implements Doctor {

    private int cost = 3000;


    @Override
    public void accept(Patient visior) {
        visior.visit(this);
    }

    public int getCost() {
        return cost;
    }
}
