package ru.job4j.inheritance;

public class TexReport {
    public String generate(String name, String body) {
        return name + System.lineSeparator() + body;
    }

}
