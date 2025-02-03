package day01;

public class SmartPhoneMain {

    public static void main(String[] args) {

        SmartPhone myPhone = new SmartPhone("갤럭시", "흰색");

        //Phone 으로 부터 싱속받은 필드를 읽어서 출력
        System.out.println(myPhone.model + " " + myPhone.color);

        //SmartPhone 의 필드 읽어서 출력
        System.out.println(myPhone.wifi);

        //Phone 으로부터 상속받은 메서드 호출
        myPhone.bell();

        //SmartPhone 으로부터 상속받은 메소드 호출
        myPhone.setWifi(true);
    }
}
