package day03.interfaceEx.ex01;

public class Tv implements RemoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Tv를 켭니다.");
    }

    @Override
    public void turnOff() { // 인터페이스에서 선언된 전원 on/off 기능 구현 Tv에 스펙에 맞추어 구현
        System.out.println("Tv를 전원을 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
            System.out.println("Tv의 볼륨 최대값으로 셋팅 되었습니다.");
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
            System.out.println("Tv의 볼륨 최소값으로 셋팅 되었습니다.");
        } else {
            this.volume = volume;
        }
    }
}
