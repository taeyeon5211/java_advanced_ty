package day04.ex01;

public class Main {

    public static void main(String[] args) {
        InterfaceA b = new B();
        InterfaceA c = new C();
        action(b);
        action(c);
    }

    public static void action(InterfaceA interfaceA) {
        if (interfaceA instanceof C) {
            interfaceA.method();
        } else {
            System.out.println("호출 불가.");
        }
    }
}
