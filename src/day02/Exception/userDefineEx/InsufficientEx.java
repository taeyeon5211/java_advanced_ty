package day02.Exception.userDefineEx;

public class InsufficientEx extends Exception { // 일반 예외로 선언한 사용자정의 예외클래스
    public InsufficientEx() {

    }

    public InsufficientEx(String message) {
        super(message);
    }
}
