package day08.set;

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

        int size = set.size();
        System.out.println(size);
    }
}
