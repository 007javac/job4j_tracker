package ru.job4j.tracker;

public class Builder extends Engineer {
    private int salary;
    private String direction;

    public int getSalary() {
        return salary;
    }
    public String getDirection() {
        return direction;
    }
    public Building build(Materials materials, Drawing drawing) {
        return new Building();
    }
}