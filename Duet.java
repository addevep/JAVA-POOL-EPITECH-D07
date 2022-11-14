public class Duet<T> {
    Duet(){
    }

    public static <T extends Comparable<T>> T min(T first, T second) {
        if (first.compareTo(second) >= 0) {
            return second;
        } else {
            return first;
        }
    }

    public static <T extends Comparable<T>> T max(T first, T second) {
        if(first.compareTo(second) >= 0) {
            return first;
        } else {
            return second;
        }
    }
}
