public class Pair<T,V> {
    T first;
    V second;

    Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public void display() {
        System.out.println("first: " + first + ", second: " + second + ".");
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }
}
