package day05.innerclass.ex06.buildertest01;

public class StudentMain {

    public static void main(String[] args) {
        Student st = new Student.studentBuilder("B889063", "정태연", "소융")
                .addGrade()
                .addPhonNumber()
                .addAddress()
                .build();
        System.out.println(st);

        //학년 입력 안할시 freshman
//        Student st1 = new Student.studentBuilder("B889063", "정태연", "소융")
//                .addPhonNumber()
//                .addAddress()
//                .build();
//        System.out.println(st1);
    }
}
