package day01.homework0203.problem01;

public class TestShape {
	public static void main(String[] args) {
		Shape [] shape = new Shape[2];
		shape[0] = new Circle(10.0);
		shape[1] = new Rectangular(10.0, 20.0);

		for (Shape shape1 : shape) {
			shape1.calculationArea();
		}
	}
}