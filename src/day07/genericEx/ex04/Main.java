package day07.genericEx.ex04;

public class Main {

    public static void main(String[] args) {
        //모든 사람이 신청 가능
        Course.registerCourse(new Applicant<Person>(new Person()));
        Course.registerCourse(new Applicant<Worker>(new Worker()));
        Course.registerCourse(new Applicant<Student>(new Student()));
        Course.registerCourse(new Applicant<HighStudnet>(new HighStudnet()));
        Course.registerCourse(new Applicant<MiddleStudent>(new MiddleStudent()));


        //학생만 신청 가능
        Course.registerCourse2(new Applicant<HighStudnet>(new HighStudnet()));
        Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
        Course.registerCourse2(new Applicant<Student>(new Student()));

        //Course.registerCourse2(new Applicant<Person>(new Person()));
        //Course.registerCourse2(new Applicant<Worker>(new Worker()));


        //직장인과 일반인만 신청 가능
        Course.registerCourse3(new Applicant<Person>(new Person()));
        Course.registerCourse3(new Applicant<Worker>(new Worker()));
        //Course.registerCourse3(new Applicant<Studnet>(new Studnet()));
    }
}
