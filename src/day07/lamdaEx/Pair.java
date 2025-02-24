package day07.lamdaEx;

public class Pair<T, U> {
    private T first;
    private U secound;

    public Pair() {

    }

    public Pair(T first, U secound) {
        this.first = first;
        this.secound = secound;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecound() {
        return secound;
    }

    public void setSecound(U secound) {
        this.secound = secound;
    }
}
