package day01.homework0203.problem02;

public class Tea extends Beverage{
    public static int amount;

    public Tea(String name) {
        super(name);
        setAmount(1);
    }

    public static int getAmount() {
        return amount;
    }

    public static void setAmount(int amount) {
        Tea.amount += amount;
    }

    @Override
    public void calcPrice() {
/*
        String name = super.getName();
        if (name.equals("lemonTea")) {
            super.getPrice();
        } else if (name.equals("ginsengTea")) {
            super.getPrice();
        } else if (name.equals("redginsengTea")) {
            super.getPrice();
        }
*/
        String name = super.getName();
        if (name.equals("lemonTea")) {
            super.setPrice(1500);
        } else if (name.equals("ginsengTea")) {
            super.setPrice(2000);
        } else if (name.equals("redginsengTea")) {
            super.setPrice(2500);
        }
    }
}
