package day06.api.lombokEx;


public class Main {

    public static void main(String[] args) {
        Member member = new Member();
        Member member1 = new Member("Shin", "ssg", 24);

        System.out.println(member1.getId());
        member1.setId("sss");
        System.out.println(member1.toString());
    }
}
