package day03.interfaceEx.prob3.p1;

public class TV implements Remocon {

    @Override
    public void powerOn() {
        System.out.println("TV를 켰습니다.");
    }

    public static void main(String[] args) {
        Remocon r = new TV();
        r.powerOn();
    }
}
