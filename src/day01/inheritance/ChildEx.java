package day01.inheritance;

public class ChildEx {

    public static void main(String[] args) {
        Parent parent = new Child();

        parent.field1 = "parentField1";
        parent.method1();
        parent.method2();
        //parent.field2 = "yyy";
        //parent.method3();
        Child child = (Child) parent;
        child.field2 = "childField2";
        child.method3();
    }
}
