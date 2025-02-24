package day08.studentEx;

import lombok.Data;

@Data
public class Student {

    private String name;
    private int korean;
    private int english;
    private int math;
    private int total;
    private double average;

    public Student(String name, int korean, int english, int math, int total, double average) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
        this.total = total;
        this.average = average;
    }
}
