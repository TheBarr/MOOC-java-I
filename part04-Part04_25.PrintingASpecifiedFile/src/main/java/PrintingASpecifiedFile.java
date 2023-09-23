
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which file should have its contents printed?");
        String file = scanner.nextLine();

        try (Scanner data = new Scanner(Paths.get(file))) {
            while (data.hasNextLine()) {
                System.out.println(data.nextLine());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
