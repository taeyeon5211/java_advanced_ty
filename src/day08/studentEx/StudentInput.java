package day08.studentEx;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentInput {

    Scanner sc = new Scanner(System.in);
    StringTokenizer st;

    public Student input() {
        System.out.print("이름,국어점수,영어점수,수학점수를 입력하세요 : ");
        st = new StringTokenizer(sc.nextLine());
        String name = st.nextToken(",");
        int korean = Integer.parseInt(st.nextToken());
        int english = Integer.parseInt(st.nextToken());
        int math = Integer.parseInt(st.nextToken());
        int total = korean + english + math;
        double average = (double) total / 3;
        Student student = new Student(name, korean, english, math, total, average);
        return student;
    }
}
