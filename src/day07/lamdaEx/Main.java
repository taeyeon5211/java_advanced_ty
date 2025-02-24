package day07.lamdaEx;

public class Main {
    // 해당 코드에서 제너릭의 역할 : 타입의 정확성을 보장하여 유연성을 제공하는 방법으로 사용됨
    public static void main(String[] args) {
        Transformer<Integer, String> intToString = (input -> "Number : " + input);
        String result = intToString.transformer(10);
        System.out.println(result.toString()); //int -> String 변환
        System.out.println(result.toString() + 1);

        Transformer<String, Integer> stringToLength = (input) -> input.length();
        Integer length = stringToLength.transformer("Hello Java Programming");
        System.out.println(length);
    }
}
