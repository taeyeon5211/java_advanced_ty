package day10.lambda.ex03;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.action((x, y) -> {
            return sum(x, y);
        });
    }

    public static double sum(double x, double y) {
        return x + y;
    }
}
