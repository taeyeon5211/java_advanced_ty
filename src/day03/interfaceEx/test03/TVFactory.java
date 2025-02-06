package day03.interfaceEx.test03;

public class TVFactory extends Factory implements IWorkingTogether{

    public TVFactory(String name, int openHour, int closeHour) {
        super(name, openHour, closeHour);
    }

    @Override
    int makeProducts(char skill) {
        if (skill == 'A') {
            return 8 * getWorkingTime();
        } else if (skill == 'B') {
            return 5 * getWorkingTime();
        } else if (skill == 'C') {
            return 3 * getWorkingTime();
        } else {
            return 1 * getWorkingTime();
        }
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
        return makeProducts('C');
    }
}
