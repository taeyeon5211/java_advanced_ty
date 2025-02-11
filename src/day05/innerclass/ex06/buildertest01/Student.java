package day05.innerclass.ex06.buildertest01;

import java.util.Scanner;

public class Student {

    private String id;
    private String name;
    private String major;

    private String grade;
    private String phoneNumber;
    private String address;

    public Student(studentBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.major = builder.major;
        this.grade = builder.grade;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
    }

    public static class studentBuilder {
        static Scanner sc = new Scanner(System.in);

        private String id;
        private String name;
        private String major;

        private String grade = "fresh man";
        private String phoneNumber;
        private String address;

        public studentBuilder(String id, String name, String major) {
            this.id = id;
            this.name = name;
            this.major = major;
        }

        public studentBuilder addGrade() {
            System.out.print("학년을 입력하세요: ");
            this.grade = sc.nextLine();
            return this;
        }
        public studentBuilder addPhonNumber() {
            System.out.print("전호번호를 입력하세요: ");
            this.phoneNumber = sc.nextLine();
            return this;
        }
        public studentBuilder addAddress() {
            System.out.print("주소를 입력하세요: ");
            this.address = sc.nextLine();
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", grade='" + grade + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
