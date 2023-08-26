
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int numberOfNumbers = 0;
        int even = 0;
        int odds = 0;

        while (true) {
            System.out.println("Give numbers:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                System.out.println("Thx! Bye!");
                break;
            }

            sum += number;
            numberOfNumbers += 1;

            if (number % 2 == 0) {
                even += 1;
            } else {
                odds += 1;
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numberOfNumbers);
        System.out.println("Average: " + (1.0 * sum / numberOfNumbers));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odds);
    }
}
