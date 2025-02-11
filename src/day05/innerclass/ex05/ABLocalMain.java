package day05.innerclass.ex05;

//로컬 클래스는 생성자 와 메소드가 실행될 동안에만 객테를 생성
class A {
    public A() {
        class B {

        }
        B b = new B();
    }

    void method() {
        class B {

        }

        B b = new B();
    }
}
public class ABLocalMain {

    public static void main(String[] args) {
        A a = new A();
        a.method();
    }
}
