
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCounter = 0;
        int numbersSum = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                if (numbersSum == 0){
                    System.out.println("Cannot calculate the average");
                }
                break;
            }
            
            if (num > 0){
                numbersSum += num;
                numberCounter += 1;
            }
            
            
        }
        double average = 1.0 * numbersSum / numberCounter;
        System.out.println("Average of the numbers: " + average);
    }
}
