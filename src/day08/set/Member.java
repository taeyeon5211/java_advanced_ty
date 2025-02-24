package day08.set;

public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        //name 과 age 값이 같으면 동일한 hashCode가 리턴
        return name.hashCode() + age;
    }

    @Override
    public boolean equals(Object obj) {
        //name 과 age가 같다면 true
        if (obj instanceof Member target) {
            return target.name.equals(name) && (target.age == age);
        } else {
            return false;
        }
    }
}
