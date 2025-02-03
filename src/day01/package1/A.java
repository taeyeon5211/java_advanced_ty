package day01.package1;

public class A {
    protected String field1;
    
    protected A() {}
    protected A(String field1) {
        this.field1 = field1;
    }

    protected void method1() {
        System.out.println("A 클래스의 method1()");
    }
}
