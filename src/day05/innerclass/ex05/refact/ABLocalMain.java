package day05.innerclass.ex05.refact;

//로컬 클래스는 생성자 와 메소드가 실행될 동안에만 객테를 생성
//메소드의 로컬변수를 로컬 클래스가 사용할 경우 로컬변수는 final 특성을 갖게 되므로 값을 읽으수만 있고 쓸수 없다.
//이유 : 코컬 내부에서 값을 변경못하도록 제한
class A {
    //메소드
    void useB(int param) {

        int value = 1;

        class B {
            int field1 = 10;
            static int field2 = 20;

            public B() {
                System.out.println("B 생성자 실행");
            }

            void method1() {
                System.out.println("B method1 실행");
/*
                System.out.println("원본 field1 값 = " + field1); //읽기
                field1 = 30;
                System.out.println("수정 field1 값 = " + field1);
*/
                System.out.println("param : " + param);
                System.out.println("value : " + value);
/*
                //쓰기 불가
                param = 10;
                value = 30;
*/
            }

            static void method2() {
                System.out.println("B static method2 실행");
            }
        }
        B b = new B();
        System.out.println(b.field1);
        b.method1();
        System.out.println(B.field2);
        B.method2();
    }
}
public class ABLocalMain {

    public static void main(String[] args) {
        A a = new A();
        a.useB(10);
    }
}
