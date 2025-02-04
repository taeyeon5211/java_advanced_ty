package day01.homework0203.problem01;

import java.util.ArrayList;

public class TestShape {
	public static void main(String[] args) {
		Shape [] shapes = new Shape[2];
		shapes[0] = new Circle(10.0, "원");
		shapes[1] = new Rectangular(10.0, 20.0, "직사각형");

		for (Shape shape : shapes) {
			shape.calculationArea();
		}

		ArrayList<Shape> shapes1 = new ArrayList<>();
		shapes1.add(new Circle(10.0, "원"));
		shapes1.add(new Circle(20.0, "원"));
		shapes1.add(new Rectangular(10.0, 20.0, "직사각형"));
		shapes1.add(new Rectangular(20.0, 30.0, "직사각형"));

		for (Shape shape : shapes1) {
			shape.calculationArea();
		}
	}
}