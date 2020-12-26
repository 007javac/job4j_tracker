package ru.job4j.tracker;

public class Doctor extends Profession {
    Pacient pacient;

    /**
     * Конструктор для экземпляра профессии.
     *
     * @param name
     * @param surname
     * @param education
     * @param birthday
     * @param pacient
     */
    public Doctor(String name, String surname, String education, String birthday, Pacient pacient) {
        super(name, surname, education, birthday);
        this.pacient = pacient;
    }

    public Diagnose heal(Pacient pacient) {
        return pacient.getDiagnose();
    }
}
