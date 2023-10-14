import java.util.ArrayList;

public class Stack {
    private ArrayList<String> strings;

    public Stack() {
        this.strings = new ArrayList<String>();
    }

    public boolean isEmpty() {
        if (strings.size() == 0) {
            return true;
        }
        return false;
    }

    public void add(String value) {
        strings.add(value);
    }

    public ArrayList<String> values() {
        return this.strings;
    }

    public String take() {
        return this.strings.remove(strings.size() - 1);
    }
}
