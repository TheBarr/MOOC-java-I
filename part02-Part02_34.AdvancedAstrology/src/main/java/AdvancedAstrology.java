
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 0; i < number; i++){
            System.out.print("*");
        }
        System.out.print("\n");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for(int i = 0; i < number; i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int spaces = size -1;
        for(int i = 1; i <= size; i++){
            printSpaces(spaces);
            printStars(i);
            spaces -= 1;
        }
        
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int spaces = height -1;
        int additional_stars = 0;
        for(int i = 1; i <= height; i++){
            printSpaces(spaces);
            printStars(i + additional_stars);
            additional_stars += 1;
            spaces -= 1;
        }
        
        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(11);
    }
}
