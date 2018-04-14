
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Type your program here:
        System.out.println("Type a number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        if(firstNumber>0)   {
            System.out.println("\nThe number is positive.");
        } else  {
            System.out.println("\nThe number is not positive.");
        }
        

        
    }
}
