package day03.interfaceEx.ex01;

public class Radio implements RemoteControl {
    private int volume;

    public int getVolume() {
        return volume;
    }

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

    //내가 사용했던 이전 볼륨을 기억했다가 쉬모드 해제 이후 다시 복원
    private int memoryVolume;
    @Override
    public void setMute(boolean mute) {
        if (mute) {
            this.memoryVolume = this.volume;
            System.out.println("쉿모드 작동");
            setVolume(RemoteControl.MIN_VOLUME);
        } else {
            System.out.println("쉿모드 해제");
            setVolume(memoryVolume);
        }
    }
}
