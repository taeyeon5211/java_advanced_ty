package day03.interfaceEx.vehicleEx;

public class Driver {
    public void drive(Vehicle vehicle) {
//        Object obj = vehicle;
//        Vehicle v = (Vehicle) obj;
        if (vehicle instanceof Taxi || vehicle instanceof Bus) {
            vehicle.run();
        } else {
            System.out.println("운영 자격에 해당하지 않습니다.");
        }
    }
}
