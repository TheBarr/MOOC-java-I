import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void search() {
        System.out.print("To be translated: ");
        String wordToTranslate = scanner.nextLine();

        if (simpleDictionary.translate(wordToTranslate) == null) {
            System.out.println("Word " + wordToTranslate + " was not found.");
        } else {
            System.out.println(simpleDictionary.translate(wordToTranslate));
        }
    }

    public void add() {
        System.out.print("Word: ");
        String word = scanner.nextLine();
        System.out.print("Translation: ");
        String translation = scanner.nextLine();
        this.simpleDictionary.add(word, translation);
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                this.add();
            } else if (command.equals("search")) {
                this.search();
            } else {
                System.out.println("Unknown command");
            }
        }
    }

}
