package ru.job4j.tracker;

public class Doctor extends Profession {

    private Diagnose diagnose;
    private String hospital;
    private String badge;

    public Diagnose heal(Pacient pacient) {
        return diagnose;
    }

    public void treatPacient() {
    }
}
