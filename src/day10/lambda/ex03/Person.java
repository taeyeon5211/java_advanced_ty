package day10.lambda.ex03;

public class Person {

    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void action(Calculable calculable) {
        double result = calculable.calculate(10, 20);
        System.out.println("결과 : " + result);
    }
}
