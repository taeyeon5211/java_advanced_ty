package day09.other;

import day01.practice.A;

import java.sql.Array;
import java.util.*;

public class UnmodifiableEx { //수정할 수 없는 컬렉션

    public static void main(String[] args) {
        //수정할 수 없는 컬렉션 만드는 방법
        //1. of()
        List<String> immutableList1 = List.of("A", "B", "C");
        //immutableList1.add("D");
        for (String s : immutableList1) {
            System.out.println(s);
        }

        Set<String> immutableSet1 = Set.of("A", "B", "C");
        //immutableSet1.remove("C");
        for (String s : immutableSet1) {
            System.out.println(s);
        }

        Map<Integer, String> immutableMap1 = Map.of(1, "A", 2, "B", 3, "C");
        //immutableMap1.put(4, "D");
        for (Map.Entry<Integer, String> entry : immutableMap1.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //List 컬렉션을 불변 컬렉션으로 복사
        List<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");
        List<String> immutableList2 = List.copyOf(list2);

        //배열로부터 List 불변 컬렉션으로 생성
        String[] array = {"A", "B", "C", "?"};
        array[3] = "D";
        for (String s : array) {
            System.out.println(s);
        }

        List<String> immutableStrings3 = Arrays.asList(array);
        for (String s : immutableStrings3) {
            System.out.println(s);
        }
    }
}
