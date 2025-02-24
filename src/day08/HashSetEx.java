package day08;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("Java");
        set.add("Programming");
        set.add("perfect");
        set.add("Spring");
        set.add("Java");

        int size = set.size();
        System.out.println(size);
    }
}
