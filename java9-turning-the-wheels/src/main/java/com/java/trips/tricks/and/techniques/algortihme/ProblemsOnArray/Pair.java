package src.main.java.com.java.trips.tricks.and.techniques.algortihme.ProblemsOnArray;

public record Pair<U, V>(U first, V second) {
    public static <U, V> Pair<U, V> of(U first, V second) {
        return new Pair<>(first, second);
    }
}
