import java.util.ArrayList;
import java.util.List;

public class Battalion {
    List<Character> battalion = new ArrayList<>();

    public void add(List<? extends Character> characters) {
        this.battalion.addAll(characters);
    }

    public void display() {
        battalion.forEach((c) -> {
            System.out.println(c.getName());
        });
    }

    public boolean fight() {
        if (battalion.get(1) != null) {
            if (battalion.get(0).compareTo(battalion.get(1)) > 0) {
                battalion.remove(1);
            } else if (battalion.get(0).compareTo(battalion.get(1)) < 0) {
                battalion.remove(0);
            } else {
                battalion.remove(0);
                battalion.remove(1);
            }
            return true;
        } else {
            return false;
        }
    }
}
