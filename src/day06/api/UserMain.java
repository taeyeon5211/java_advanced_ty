package day06.api;

import java.util.Arrays;

public class UserMain {

    public static void main(String[] args) throws CloneNotSupportedException {

//        //앝은 복사(shallow copy)
//        User user = new User();
//        user.setName("Shin");
//        User copy = user;
//
//        System.out.println(user.hashCode());
//        System.out.println(copy.hashCode());
//        System.out.println(user.equals(copy));
//
//        //깊은 복사(Deep copy)
//        try {
//            User user1 = new User();
//            user1.setName("Shin");
//            User copy1 = (User) user1.clone();
//
//            System.out.println(user1.hashCode());
//            System.out.println(copy1.hashCode());
//            System.out.println(user1.equals(copy1));
//        } catch (CloneNotSupportedException e) {
//            throw new RuntimeException(e);
//        }

        User[] arrayObj = {new User(100, "park"), new User(101, "kim"), new User(102, "kang")};
        System.out.println(Arrays.toString(arrayObj));

        User[] arrayObj1 = new User[3];
        for (int i = 0; i < arrayObj.length; i++) {
            arrayObj1[i] = arrayObj[i].clone();
        }
        //arrayObj1 = arrayObj.clone();
        System.out.println(Arrays.toString(arrayObj1));

        System.out.println(arrayObj[0].getId());
        System.out.println(arrayObj1[0].getId());
        arrayObj1[0].setId(999); //복사한 arrayObj1의 첫번째 객체의 멤버값을 변경
        System.out.println(arrayObj[0].getId());
        System.out.println(arrayObj1[0].getId());
    }
}
