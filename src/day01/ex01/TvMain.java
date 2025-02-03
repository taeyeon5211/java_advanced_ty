package day01.ex01;

public class TvMain {

    public static void main(String[] args) {
        Tv tv_remoteControl1 = new Tv(); //동일한 클래스 타입의 참조 변수를 생성해서 초기화
        Tv tv_remoteControl2 = new SmartTv(); //부모타입으로 자식클래스 타입을 받아 초기화
        SmartTv smart_remoteControl = new SmartTv();

        Tv tv = new Tv();
        SmartTv  smart_control = (SmartTv) tv;
    }
}
