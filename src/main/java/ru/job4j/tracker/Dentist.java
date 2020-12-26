package ru.job4j.tracker;

public class Dentist extends Doctor {
    private boolean hasAnostesia;

    public Dentist(String name, String surname, String education, String birthday, Pacient pacient, boolean hasAnostesia) {
        super(name, surname, education, birthday, pacient);
        this.hasAnostesia = hasAnostesia;
    }

    public void doHealTooth(Pacient pacient) {
    }
}