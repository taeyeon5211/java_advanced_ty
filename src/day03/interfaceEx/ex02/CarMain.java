package day03.interfaceEx.ex02;

public class CarMain {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.run();

        myCar.tire1 = new kumhoTire();
        myCar.tire2 = new kumhoTire();

        myCar.run();
    }
}
