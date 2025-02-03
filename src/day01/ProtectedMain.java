package day01;

class A {
    protected String field1;

    protected A() {}
    protected A(String field1) {
        this.field1 = field1;
    }

    protected void method1() {
        System.out.println("A 클래스의 method1()");
    }
}

class B {
    protected String field1;

    protected B() {}

    protected void method1() {
        System.out.println("B 클래스의 method1()");
        A a = new A();
        a.field1 = "vlaue1";
        a.method1();
    }
}

public class ProtectedMain {

    public static void main(String[] args) {

    }
}
