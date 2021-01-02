package ru.job4j.tracker;

public class Builder extends Engineer {
    private String buildAddress;
    private Template template;

    public Builder(String name, String surname, String education, String birthday, Project project, String buildAddress, Template template) {
        super(name, surname, education, birthday, project);
        this.buildAddress = buildAddress;
        this.template = template;
    }

    public void buildHome(Template template) {
    }
}