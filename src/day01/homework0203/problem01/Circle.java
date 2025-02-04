package day01.homework0203.problem01;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius, String name) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculationArea() {
        print();
    }

    @Override
    public void print() {
        double radius = getRadius();
        double area = Math.PI * Math.pow(radius, 2);
        String name = super.getName();
        System.out.println(name + "의 면적은 " + area);
    }
}
