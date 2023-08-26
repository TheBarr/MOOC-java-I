

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }  
    
    public static void printUntilNumber(int number) {
        int counter = 1;
        while (counter <= number){
            System.out.println(counter);
            counter += 1;
        }
        
    }

}
