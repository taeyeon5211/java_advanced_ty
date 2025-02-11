package day04.interfacetraining;

public class Main {

    public static void main(String[] args) {

        ABCImpl abcImlp = new ABCImpl();

        InterfaceA ia = abcImlp;
        ia.methodA();
        System.out.println();

        InterfaceB ib = abcImlp;
        ib.methodA();
        ib.methodB();
        System.out.println();

        InterfaceC ic = abcImlp;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
