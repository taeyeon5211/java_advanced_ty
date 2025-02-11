package day07.genericEx.pratices;
//어떤 타입의 배열을 받아 요소를 출력하는 제너릭 메서드 printArray를 작성하세요
public class GennericMethodEx {

    public static <T> void printArray(T[] array) {
        for (T t : array) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        String[] strArr = {"a", "b", "c"};
        printArray(strArr);
        Integer[] intArr = {1, 2, 3};
        printArray(intArr);
    }
}
