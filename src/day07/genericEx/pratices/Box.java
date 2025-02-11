package day07.genericEx.pratices;
//어떤 타입의 객체든 저장할 수 있는 제너릭 클래스 Box. 객체를 설정하고 가져오는 메소드를 구현하세요
public class Box<T> {
    private T t;

    public Box(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Box{" +
                "t=" + t +
                '}';
    }

    public static void main(String[] args) {
        Box<String> box1 = new Box<>("jty");
        System.out.println(box1);
        Box<Integer> box2 = new Box<>(27);
        System.out.println(box2);
    }
}
