package src.main.java.com.java.trips.tricks.and.techniques.algortihme.interview.designpaterns.singleton;

public class A {

    private A() {

    }

    public static class AHolder {
        private static final A INSTANCE = new A();
    }

    public static A getInstance() {
        return AHolder.INSTANCE;
    }
}
