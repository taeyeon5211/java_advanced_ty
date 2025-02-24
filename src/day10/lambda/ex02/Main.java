package day10.lambda.ex02;

public class Main {

    public static void main(String[] args) {
        String grContent = "\"저는 오랜 무명 생활로 고생 했답니다. 여러분 저를 사랑해주셔서 감사합니다.\"";
        Person gr = new Person("황가람", "가수", grContent, "\"반딧불\"");
        String smContent = "\"저를 오랫동안 사랑해주셔서 감사합니다.\"";
        Person sm = new Person("조수미", "가수", smContent, "\"밤의 아리아\"");

        gr.action(((name, job) -> System.out.println(name + "은 " + job + " 입니다.")));
        gr.action2((content -> System.out.println(content + " 말합니다.")));
        gr.action3((title -> System.out.println(title + "을 부릅니다.")));

        sm.action(((name, job) -> System.out.println(name + "은 " + job + " 입니다.")));
        sm.action2((content -> System.out.println(content + " 말합니다.")));
        sm.action3((title -> System.out.println(title + "를 부릅니다.")));
    }
}
