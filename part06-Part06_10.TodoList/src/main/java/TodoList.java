import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;

    public TodoList() {
        this.list = new ArrayList<String>();
    }

    public void add(String task) {
        this.list.add(task);
    }

    public void print() {
        int index = 1;

        for (String e : list) {
            System.out.println(index + ": " + e);
            index++;
        }
    }

    public void remove(int number) {
        this.list.remove(number - 1);
    }
}
