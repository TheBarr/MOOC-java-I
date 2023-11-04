
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LiquidManager first = new LiquidManager();
        LiquidManager second = new LiquidManager();

        while (true) {
            System.out.print("> ");
            System.out.println("\nFirst: " + first.getLiquid() + "/100");
            System.out.println("Second: " + second.getLiquid() + "/100");
            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String method = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (amount <= 0) {
                continue;
            }

            if (method.equals("add")) {
                System.out.println(amount);
                first.AddLiquid(amount);

            } else if (method.equals("move")) {
                first.MoveLiquid(second, amount);
            } else if (method.equals("remove")) {
                second.removeLiquid(amount);
            }
        }
    }

}
