package day03.interfaceEx.ex02;

public class HankookTire implements Tire{
    @Override
    public void roll() {
        System.out.println("한국 타이어를 회전합니다.");
    }
}
