package day07.genericEx.ex03;

public class Sample {

    public static <T> void printValue(T value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        printValue("Hello World!");
        printValue(12345);
    }
}
