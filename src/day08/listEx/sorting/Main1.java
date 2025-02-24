package day08.listEx.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//사용자(User) 이름과 나이로 5명(객체)를 생성하고 나이순으로 정렬 한 후  사용자의 이름과 나ㅏ이를 출력하시오
//ex) 홍길동 32세
//    임준오 48세

public class Main1 {


    public static void main(String[] args) {
        class User implements Comparable<User> {
            String name;
            int age;

            User(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public int compareTo(User o) {
                return this.age - o.age;
            }

            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }

            @Override
            public String toString() {
                return name + " " + age;
            }
        }

        ArrayList<User> users = new ArrayList<>();

        User user1 = new User("a", 15);
        User user2 = new User("b", 14);
        User user3 = new User("c", 13);
        User user4 = new User("d", 12);
        User user5 = new User("e", 11);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);

//        Collections.sort(users);
//        users.forEach(System.out::println);

        Collections.sort(users, Comparator.comparing(User::getAge));
        for (User user : users) {
            System.out.println(user.name + " " + user.age);
        }

        Collections.sort(users, Comparator.comparing(User::getName));
        for (User user : users) {
            System.out.println(user.name + " " + user.age);
        }

        Collections.sort(users, Comparator.comparing(User::getAge).thenComparing(User::getName));
        for (User user : users) {
            System.out.println(user.name + " " + user.age);
        }
    }
}
