package src.main.java.com.java.trips.tricks.and.techniques.algortihme.interview;

public class SolutionEnumTest {
    enum Planet {
        MERCURY, VENUS, EARTH
    }

    public static void main(String[] args) {
        boolean b = Planet.MERCURY == Planet.MERCURY;
        System.out.println(b);
        boolean c = Planet.MERCURY == Planet.VENUS;
        System.out.println(c);
        boolean d = Planet.MERCURY.equals(Planet.MERCURY) ;
        System.out.println(d);

    }
}
