import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void add() {
        System.out.print("To add: ");
        String task = scanner.nextLine();
        todoList.add(task);
    }

    public void remove() {
        System.out.print("Which one is removed? ");
        int toRemove = Integer.valueOf(scanner.nextLine());
        todoList.remove(toRemove);
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                this.add();
            } else if (command.equals("list")) {
                this.todoList.print();
            } else if (command.equals("remove")) {
                this.remove();
            }
        }
    }
}
