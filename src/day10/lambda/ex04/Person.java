package day10.lambda.ex04;

public class Person {

    public void action(Calculable calculable) {
        double result = calculable.calculate(10, 20);
        System.out.println("결과 : " + result);
    }
}
