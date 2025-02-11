package day03.interfaceEx.ex02;

public class Car {

    public Tire tire1 = new HankookTire();
    public Tire tire2 = new HankookTire();

    public void run() {
        tire1.roll();
        tire2.roll(); //인터페이스에 선언된 추상메소드를 호출했다. 구현 객체의 roll 메소드를 실행했다.
    }
}
