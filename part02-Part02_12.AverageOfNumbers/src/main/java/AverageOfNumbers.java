
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCounter = 0;
        int numbersSum = 0;
        while (true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0){
                break;
            }
            numberCounter += 1;
            numbersSum += num;
        }
        double average =  1.0 * numbersSum / numberCounter;
        System.out.println("Average of the numbers: " + average);
    }
}
