package day03.interfaceEx.test03;

public class CarFactory extends Factory implements IWorkingTogether {

    public CarFactory(String name, int openHour, int closeHour) {
        super(name, openHour, closeHour);
    }

    @Override
    int makeProducts(char skill) {
        if (skill == 'A') {
            return 3 * getWorkingTime();
        } else if (skill == 'B') {
            return 2 * getWorkingTime();
        } else if (skill == 'C') {
            return 1 * getWorkingTime();
        } else {
            return 0 * getWorkingTime();
        }
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
        return makeProducts('B');
    }
}
