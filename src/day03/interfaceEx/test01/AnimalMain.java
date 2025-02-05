package day03.interfaceEx.test01;

public class AnimalMain {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.cry();
        cat.play();
        int length = cat.tail(10);
        System.out.println("꼬리 길이 : " + length);
    }
}
