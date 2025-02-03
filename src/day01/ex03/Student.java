package day01.ex03;

public class Student extends Person {
    public int studentNo;

    public Student(String name, int studentNo) {
        super(name); // default 생성자 없을시
        this.studentNo = studentNo;
    }

    public void study() {
        System.out.println("공부를 합니다.");
    }
}
