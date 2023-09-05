
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a word: ");
        String str = scanner.nextLine();
        
        int i=3;
        while(0 < i){
            System.out.print(str);
            i -= 1;
        }
        // Write your program here

    }
}
