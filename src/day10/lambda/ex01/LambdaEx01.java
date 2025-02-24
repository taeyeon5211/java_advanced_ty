package day10.lambda.ex01;

public class LambdaEx01 {

    public static void main(String[] args) {

        action((x, y) -> {
            int result1 = x + y;
            System.out.println("result1 = " + result1);
        });

        action((x, y) -> {
            int result2 = x - y;
            System.out.println("result2 = " + result2);
        });


    }

    public static void action(Calculable calculable) {
        int x = 10;
        int y = 20;
        calculable.calculate(x, y);
    }
}
