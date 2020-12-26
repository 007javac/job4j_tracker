package ru.job4j.tracker;

public class Pacient {
    private String name;
    private Diagnose diagnose;

    public Pacient(String name, Diagnose diagnose) {
        this.name = name;
        this.diagnose = diagnose;
    }

    public Diagnose getDiagnose() {
        return diagnose;
    }
}