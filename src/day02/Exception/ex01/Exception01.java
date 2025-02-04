package day02.Exception.ex01;

public class Exception01 {

    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        printLength("This is Java Programming");
        printLength(null);

//        try {
//            Class.forName("java.lang.String1");
//            System.out.println("java.lang.String 클래스가 존재합니다.");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

        System.out.println("프로그램 종료");
    }

    //try - catch 메소드 나 생성자 안
    public static void printLength(String data) {
        int result = 0;
        try {
            result = data.length();
            System.out.println("문자의 수 : " + result);
        } catch (Exception e) {
            //System.out.println(e.getMessage()); //예외 정보를 얻는 방법1
            //System.out.println(e.toString()); //예외 정보를 얻는 방법2
            e.printStackTrace(); //예외 정보를 얻는 방법3
        } finally {
            System.out.println("마무리 실행\n");
        }
    }
}
