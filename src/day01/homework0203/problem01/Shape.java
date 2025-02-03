package day01.homework0203.problem01;

public abstract class Shape {

    private double area;
    private String name;

    public Shape() {

    }

    public Shape(String name) {
        this.name = name;
    }

    public abstract void calculationArea();

    public void print() {

    }
}
