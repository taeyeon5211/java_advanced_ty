package day01.package1;

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
