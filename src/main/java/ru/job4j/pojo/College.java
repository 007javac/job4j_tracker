package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student yura = new Student();
        yura.setFullName("Карамышев Юрий Юрьевич");
        yura.setGroup("ГКСР-01");
        yura.setAdmission(new Date());
        System.out.println("student: " + yura.getFullName() + ", group: " + yura.getGroup() + ", data: " + yura.getAdmission());
    }
}
