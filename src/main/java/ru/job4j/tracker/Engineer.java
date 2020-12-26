package ru.job4j.tracker;

public class Engineer extends Profession {
    Project project;

    /**
     * Конструктор для экземпляра профессии.
     *
     * @param name
     * @param surname
     * @param education
     * @param birthday
     */
    public Engineer(String name, String surname, String education, String birthday, Project project) {
        super(name, surname, education, birthday);
        this.project = project;
    }

    public void doProject(House house) {
    }
}
