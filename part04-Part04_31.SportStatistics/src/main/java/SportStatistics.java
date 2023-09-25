
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine();

        int counter = 0;
        int wins = 0;
        int losses = 0;
        try (Scanner data = new Scanner(Paths.get(file))) {
            while (data.hasNextLine()) {
                String[] line = data.nextLine().split(",");
                if (line[0].equals(team) || line[1].equals(team)) {
                    counter++;
                    if ((line[0].equals(team) && Integer.valueOf(line[2]) > Integer.valueOf(line[3])
                            || (line[1].equals(team) && Integer.valueOf(line[3]) > Integer.valueOf(line[2])))) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
            System.out.println("Games: " + counter);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
