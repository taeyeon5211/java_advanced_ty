package day01.homework0203.problem02;

public abstract class Beverage {

    private String name;
    protected int price;
    protected static int cnt; // static 일시 증가 static 아니면 1로 고정됨

    public Beverage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract void calcPrice();

    public void print() {
        cnt++;
        System.out.println(cnt + "번째 판매 음표는 " + getName() + "이며, 가격은 " + getPrice());
    }
}
