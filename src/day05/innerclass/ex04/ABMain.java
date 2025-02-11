package day05.innerclass.ex04;

class A {

    B field1 = new B();

    static B field2 = new B();

    static class B {

    }

    A() {
        B b = new B();
    }

    void method1() {
        B b = new B();
    }

    void method2() {
        B b = new B();
    }
}

public class ABMain {

    public static void main(String[] args) {
        //정적 멤버 클래스 B 는 A.B() 생성 가능
        A.B b = new A.B();
    }
}
