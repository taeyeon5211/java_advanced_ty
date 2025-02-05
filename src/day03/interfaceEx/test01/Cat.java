package day03.interfaceEx.test01;

public class Cat extends Pet {
    @Override
    public void cry() {
        System.out.println("야옹");
    }

    @Override
    public int tail(int length) {
        return length;
    }

    @Override
    public void play() {
        System.out.println("고양이가 놀아요");
    }

}
