package day02.Exception.throwsEx;

public class ThrowsEx {

    public static void main(String[] args) throws ClassNotFoundException{
//        try {
//            findClass();
//        } catch (ClassNotFoundException e) {
//            System.out.println("예외 처리 : " + e.getMessage());
//        }
        findClass();
    }

    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2");
    }
}
