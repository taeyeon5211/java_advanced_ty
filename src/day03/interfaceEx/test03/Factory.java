package day03.interfaceEx.test03;

public abstract class Factory {
    int openHour;
    int closeHour;
    String name;

    public Factory(String name, int openHour, int closeHour) {
        this.name = name;
        this.openHour = openHour;
        this.closeHour = closeHour;
    }

    String getFactoryName() {
        return name;
    }

    int getWorkingTime() {
        return closeHour - openHour;
    }

    abstract int makeProducts(char skill);
}
