package day06.api;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MemberMain {

    public static void main(String[] args) {
        Member m1 = new Member("신세종");
        Member m4 = m1;
        Member m2 = new Member("신세종");
        Member m3 = new Member("ssg3");

        //컴퓨터 관점
        System.out.println(m1 == m2); //주소값 비교 false
        //System.out.println(m1.equals(m2)); //Object equals() 주소값 비교 (override 전)

        //사용자 관점
        System.out.println(m1.equals(m2));

        //객체 인스턴스 마다 각기 다른 해시코드(주소) 값을 가지기 때문이다.
        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());

        //순수 객체의 주소를 얻고 싶을때
        System.out.println(System.identityHashCode(m1));
        System.out.println(System.identityHashCode(m2));

        //리스트를 생성하고 두 객체 데이터 추가
        List<Member> members = new ArrayList<>();
        members.add(m1);
        members.add(m2);
        System.out.println("현재 m클라우드 짐은 " + members.size() + "명의 회원이 존재합니다.");

        Set<Member> members1 = new HashSet<>();
        members1.add(m1);
        members1.add(m2);
        System.out.println(members1.size());
        //Collection(HashMap, HashSet, HashTable) 은 객체가 논리적으로 같은지를 비교할때 hashcode() -> equals()
    }
}
