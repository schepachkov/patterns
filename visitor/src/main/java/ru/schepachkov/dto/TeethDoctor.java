package ru.schepachkov.dto;

public class TeethDoctor implements Doctor {

    private int cost = 5000;

    @Override
    public void accept(Patient visior) {
        visior.visit(this);
    }

    public int getCost() {
        return cost;
    }
}
