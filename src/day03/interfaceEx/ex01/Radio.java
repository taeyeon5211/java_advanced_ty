package day03.interfaceEx.ex01;

public class Radio implements RemoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("라디오를 켠다.");
    }

    @Override
    public void turnOff() {
        System.out.println("라디오를 끈다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
            System.out.println("Radio의 볼륨 최대값으로 셋팅 되었습니다.");
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
            System.out.println("Radio의 볼륨 최소값으로 셋팅 되었습니다.");
        } else {
            this.volume = volume;
        }
    }
}
