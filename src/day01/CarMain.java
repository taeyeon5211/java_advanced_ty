package day01;

public class CarMain {

    public static void main(String[] args) {
        Car myCar1 = new Car(0);
        SportsCar myCar2 = new SportsCar(0);
        setSpeed(myCar1, 3);
        setSpeed(myCar2, 5);
        System.out.println(myCar1.speed);
        System.out.println(myCar2.speed);
        myCar2.stop();
        System.out.println(myCar2);
    }

    public static void setSpeed(Car car, int cnt) {
        for (int i = 0; i < cnt; i++) {
            car.speedUp();
        }
    }
}
