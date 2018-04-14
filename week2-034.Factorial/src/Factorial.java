
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int factorialNumber = Integer.parseInt(reader.nextLine());
        int factorial = 1;
        int i = 1;
        
        while (i <= factorialNumber) {
            factorial *= i;
            i++;
        }
        
        System.out.println("Factorial is " + factorial);
    }
}
