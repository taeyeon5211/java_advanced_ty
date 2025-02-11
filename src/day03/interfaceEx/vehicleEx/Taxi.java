package day03.interfaceEx.vehicleEx;

public class Taxi implements Vehicle {
    @Override
    public void run() {
        System.out.println("택시가 이동합니다.");
    }
}
