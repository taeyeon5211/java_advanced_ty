package day03.interfaceEx.vehicleEx;

public class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("버스가 이동합니다.");
    }
}
