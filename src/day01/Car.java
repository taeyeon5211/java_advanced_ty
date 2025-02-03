package day01;

public class Car {
    public int speed;

    public Car(int speed) {
        this.speed = speed;
    }

    public void speedUp() {
        this.speed++;
    }

    public final void stop() {
        System.out.println("차를 멈춥니다.");
        this.speed = 0;
    }
}
