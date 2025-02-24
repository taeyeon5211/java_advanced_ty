package day10.lambda.ex05;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.ordering(String::compareToIgnoreCase);

    }
}
