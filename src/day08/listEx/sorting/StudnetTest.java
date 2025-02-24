package day08.listEx.sorting;

public class StudnetTest {

    public static void main(String[] args) {
        Student cs = new Student(250123, "김철수");
        Student yh = new Student(240867, "최영희");

        int isBig = cs.compareTo(yh);
        System.out.println(isBig);
    }
}
