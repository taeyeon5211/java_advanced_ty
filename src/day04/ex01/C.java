package day04.ex01;

public class C implements InterfaceA {
    @Override
    public void method() {
        method2();
    }

    public void method2() {
        System.out.println("C.method2");
    }
}
