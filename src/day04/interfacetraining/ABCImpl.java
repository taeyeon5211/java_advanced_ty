package day04.interfacetraining;

public class ABCImpl implements InterfaceC{

    @Override
    public void methodC() {
        System.out.println("ABCImpl.methodC");
    }

    @Override
    public void methodB() {
        System.out.println("ABCImpl.methodB");
    }

    @Override
    public void methodA() {
        System.out.println("ABCImpl.methodA");
    }
}
