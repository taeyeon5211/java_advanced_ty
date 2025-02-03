package day01;

public class SportsCar extends Car{

    public SportsCar(int speed) {
        super(speed);
    }

    @Override
    public void speedUp() {
        super.speed = this.speed + 10;
    }

    @Override
    public String toString() {
        return "현재 속도는: " + this.speed;
    }
}
