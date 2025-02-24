package day08.studentEx;

import java.util.*;

public class StudentMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentInput si = new StudentInput();
        List<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("1. 입력 2. 조회 3. 종료");
            int cmd = sc.nextInt();
            if (cmd == 1) {
                students.add(si.input());
            } else if (cmd == 2) {
                Collections.sort(students, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        if (o1.getAverage() > o2.getAverage()) {
                            return -1;
                        } else {
                            return 1;
                        }
                    }
                });
                int cnt = 1;
                System.out.println("이름\t 국어\t 영어\t 수학\t 총점\t 평균\t 등수");
                for (Student student : students) {
                    System.out.printf("%3s\t %3d\t %3d\t %3d\t %3d\t %3.1f\t %3d\n", student.getName(), student.getKorean(), student.getEnglish(), student.getMath(), student.getTotal(), student.getAverage(), cnt);
                    cnt++;
                }
            } else if (cmd == 3) {
                break;
            }
        }
    }
}
