package day03.interfaceEx.ex01;

public class RemoteControlMain {

    public static void main(String[] args) {

        //상수는 구현 객체와 관련이 없는 인터페이스의 멤버이므로 인터페이스로 바로 접근하여 상수값을 읽는다.
        System.out.println("리모컨 최대 볼륨 : " + RemoteControl.MAX_VOLUME);
        System.out.println("리모컨 최소 볼륨 : " + RemoteControl.MIN_VOLUME);

        RemoteControl remoteControl;

        remoteControl = new Tv();
        remoteControl.turnOn();
        remoteControl.setVolume(10);
        remoteControl.turnOff();

        remoteControl = new Radio();
        remoteControl.turnOn();
        remoteControl.setVolume(-10);
        remoteControl.turnOff();
    }
}
