package ru.job4j.tracker;

public class Programmer extends Engineer {
    String code;

    /**
     * Конструктор для экземпляра профессии.
     *
     * @param name
     * @param surname
     * @param education
     * @param birthday
     * @param project
     * @param code
     */
    public Programmer(String name, String surname, String education, String birthday, Project project, String code) {
        super(name, surname, education, birthday, project);
        this.code = code;
    }

    public void writeCode() {
    }

    public void debugging() {
    }
}