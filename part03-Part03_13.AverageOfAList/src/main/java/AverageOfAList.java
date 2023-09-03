
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        int num = 0;
        while (num != -1){
            num = Integer.valueOf(scanner.nextLine());
            if (num != -1){
                list.add(num);
            }
            
        }

        int sum = 0;
        for(int number: list){
            sum += number;
        }
        System.out.println(list.size());
        System.out.println(list);
        System.out.println("Average: " + sum / (double) (list.size()));

        
    }
}
