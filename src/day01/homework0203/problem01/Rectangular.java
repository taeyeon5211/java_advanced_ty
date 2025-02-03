package day01.homework0203.problem01;

public class Rectangular extends Shape{
    private double width;
    private double height;

    public Rectangular(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void calculationArea() {
        print();
    }

    @Override
    public void print() {
        double width = getWidth();
        double height = getHeight();
        System.out.println("직사각형의 면적은 " + width * height);
    }
}
