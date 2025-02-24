package day08.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        //객체 저장
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);
        map.put("4", 4);
        System.out.println(map.size());
        System.out.println("=".repeat(10));

        String key = "4";
        int value = map.get(key);
        System.out.println(value);

        for (String s : map.keySet()) {
            System.out.print(s + " ");
        }
        System.out.println();

        Set<String> keySet = map.keySet();
        Iterator<String> keyIter = keySet.iterator();
        while (keyIter.hasNext()) {
            String k = keyIter.next();
            Integer v = map.get(k);
            System.out.println(k + " : " + v);
        }

        for (Integer integer : map.values()) {
            System.out.print(integer + " ");
        }
        System.out.println();

        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " " + stringIntegerEntry.getValue());
        }
    }
}
