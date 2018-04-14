
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.println("Type a number: " );        
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.println("Type a second number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());
        
        double divideNumbers = (double) firstNumber / (double)secondNumber;
        System.out.println("Division: " + firstNumber + "/" + secondNumber + "=" + divideNumbers);
    }
}
