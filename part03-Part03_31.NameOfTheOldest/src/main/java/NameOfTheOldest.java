
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String name = "";
        while (true) {
            String str = scanner.nextLine();
            if (str.equals("")) {
                break;
            }

            String[] arr = str.split(",");
            int age = Integer.valueOf(arr[1]);
            

            if (age > oldest) {
                oldest = age;
                name = arr[0];
            }
        }

        System.out.println("Name of the oldest: " + name);

    }
}
