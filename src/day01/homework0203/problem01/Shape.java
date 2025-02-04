package day01.homework0203.problem01;

public abstract class Shape {

    protected double area; // protected 이므로 자식이 사용가능
    private String name;

    public Shape() {

    }

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void calculationArea();

    public void print() {

    }
}
