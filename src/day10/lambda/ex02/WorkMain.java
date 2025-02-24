package day10.lambda.ex02;

public class WorkMain {

    public static void main(String[] args) {
        Person p = new Person("홍길동", "개발자", "프로그래밍");

        p.action((name, job) -> System.out.println(name + "씨는 " + job + " 입니다."));
        p.action2((content) -> System.out.println(content + "은 정말 재미있어!!"));
    }
}
