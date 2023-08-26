
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountOfNumbers = 0;
        int sumOfNumbers = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == 0) {
                break;
            }

            amountOfNumbers += 1;
            sumOfNumbers += num;

        }
        System.out.println("Number of numbers: " + amountOfNumbers);
        System.out.println("Sum of the numbers: " + sumOfNumbers);
    }
}
