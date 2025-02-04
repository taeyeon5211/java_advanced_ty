package day02.Exception.ex01;

public class Exception02 {

    public static void main(String[] args) {
        String[] stringArray = {"100", "1oo"};

        for (int i = 0; i < stringArray.length + 1; i++) {
            try {
                int value = Integer.parseInt(stringArray[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스가 초과되었습니다." + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("숫자로 변환할 수 없는 데이터입니다." + e.getMessage());
            }
        }
    }
}
