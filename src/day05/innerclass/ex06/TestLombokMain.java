package day05.innerclass.ex06;

public class TestLombokMain {

    public static void main(String[] args) {
        TestLombok lombok = new TestLombok();
        lombok.setName("정태연");
        String name = lombok.getName();
        System.out.println(name);
    }
}
