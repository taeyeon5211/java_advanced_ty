package day01.homework0203.problem02;

public class Coffee extends Beverage {
    public static int amount;

    public Coffee(String name) {
        super(name);
        setAmount(1);
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount += amount;
    }

    @Override
    public void calcPrice() {
/*
        String name = super.getName();
        if (name.equals("Americano")) {
            super.getPrice();
        } else if (name.equals("CafeLatte")) {
            super.getPrice();
        } else if (name.equals("Cappuccino")) {
            super.getPrice();
        }
*/
        String name = super.getName();
        if (name.equals("Americano")) {
            super.setPrice(1500);
        } else if (name.equals("CafeLatte")) {
            super.setPrice(2500);
        } else if (name.equals("Cappuccino")) {
            super.setPrice(3000);
        }

    }
}
