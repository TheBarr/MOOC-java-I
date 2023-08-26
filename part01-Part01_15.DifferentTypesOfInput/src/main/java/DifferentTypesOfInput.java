
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String text = scan.nextLine();
        System.out.println("Give an integer:");
        int number = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double double_number = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean decision = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + number);
        System.out.println("You gave the double " + double_number);
        System.out.println("You gave the boolean " + decision);
    }
}
