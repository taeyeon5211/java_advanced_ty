package day03.interfaceEx.ex01;

public interface RemoteControl {
    //가장 큰 볼륨을 저장할 멤버 30 값 할당
    public static final int MAX_VOLUME = 30;
    //가장 작은 볼륨을 저장할 멤버 0 할당
    int MIN_VOLUME = 0;

    public void turnOn(); // {} 없으면 자동으로 abstract

    public void turnOff();

    void setVolume(int volume); // 볼륨셋팅
}
