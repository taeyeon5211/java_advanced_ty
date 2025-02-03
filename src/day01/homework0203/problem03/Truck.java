package day01.homework0203.problem03;

public class Truck extends Wheeler{

    public Truck(int velocity, String carName, int wheelNumber) {
        super(velocity, carName, wheelNumber);
    }

    @Override
    public void speedUp(int speed) {
        super.setVelocity(super.getVelocity() + speed * 5);
        if (super.getVelocity() > 100) {
            System.out.println("트럭의 최대속도위반으로 속도를 100으로 낮춥니다.");
            super.setVelocity(100);
            return;
        }
    }

    @Override
    public void speedDown(int speed) {
        super.setVelocity(super.getVelocity() - speed * 5);
        if (super.getVelocity() < 50) {
            System.out.println("트럭의 최저속도위반으로 속도를 50으로 올립니다.");
            super.setVelocity(50);
            return;
        }
    }
}
