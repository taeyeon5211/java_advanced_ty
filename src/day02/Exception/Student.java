package day02.Exception;

public class Student extends Manager {
    //permit 지정 안됨 -> 상속불가
    //봉인 해체된 Manager 클래스는 상속 가능

    @Override
    public void work() {
        System.out.println("공부를 열심히 합니다.");
    }
}
