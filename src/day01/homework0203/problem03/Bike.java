package day01.homework0203.problem03;

public class Bike extends Wheeler{

    public Bike(int velocity, String carName, int wheelNumber) {
        super(velocity, carName, wheelNumber);
    }

    @Override
    public void speedUp(int speed) {
        super.setVelocity(getVelocity() + speed);
        if (super.getVelocity() > 40) {
            System.out.println("자전거의 최대속도위반으로 속도를 40으로 낮춥니다.");
            super.setVelocity(40);
        }
    }

    @Override
    public void speedDown(int speed) {
        super.setVelocity(super.getVelocity() - speed);
        if (super.getVelocity() < 10) {
            System.out.println("자건거의 최저속도위반으로 속도를 10으로 올립니다.");
            super.setVelocity(10);
        }
    }
}
