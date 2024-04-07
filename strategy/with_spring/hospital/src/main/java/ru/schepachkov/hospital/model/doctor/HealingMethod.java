package ru.schepachkov.hospital.model.doctor;

public enum HealingMethod {

    TRADITIONAL("traditional"),
    MAGIC("magic"),
    FOLK("folk");

    private String alias;

    HealingMethod(String alias) {
        this.alias = alias;
    }

    public String getAlias() {
        return alias;
    }
}
