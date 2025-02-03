package day01.homework0203.problem03;

public class Prob1 {
    public static void main(String[] args) {
        Truck truck = new Truck(100, "트럭", 4);
        Bike bike = new Bike(25, "자전거", 2);
        wheelNumberInfo(truck);
        wheelNumberInfo(bike);
        velocityInfo(truck);
        velocityInfo(bike);
        truck.speedDown(100);
        bike.speedDown(25);
        truck.stop();
        bike.stop();
        truck.speedUp(10);
        velocityInfo(truck);
    }

    public static void wheelNumberInfo(Wheeler wheeler) {
        System.out.println(wheeler.getCarName() + " : 바퀴 " + wheeler.getWheelNumber() + "개 입니다.");
    }

    public static void velocityInfo(Wheeler wheeler) {
        System.out.println(wheeler.getCarName() + "의 현재 속도는 " + wheeler.getVelocity() + " 입니다.");
    }
}
