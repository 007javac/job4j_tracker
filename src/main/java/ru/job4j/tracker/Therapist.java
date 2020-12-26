package ru.job4j.tracker;

public class Therapist extends Doctor {
    private String medicine;

    /**
     * Конструктор для экземпляра профессии.
     *
     * @param name
     * @param surname
     * @param education
     * @param birthday
     * @param pacient
     * @param medicine
     */
    public Therapist(String name, String surname, String education, String birthday, Pacient pacient, String medicine) {
        super(name, surname, education, birthday, pacient);
        this.medicine = medicine;
    }

    public void curing(Pacient pacient) {
    }
}
