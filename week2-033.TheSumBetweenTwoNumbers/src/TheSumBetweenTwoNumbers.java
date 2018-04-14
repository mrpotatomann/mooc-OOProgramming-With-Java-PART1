
import java.util.Scanner;

public class TheSumBetweenTwoNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First: ");
        int firstNumber = Integer.parseInt(reader.nextLine());

        System.out.println("Last: ");
        int lastNumber = Integer.parseInt(reader.nextLine());
        int sum = 0;
        
        while (firstNumber <= lastNumber) {
            sum += firstNumber;
            firstNumber++;
        }
        System.out.println("The sum is " + sum);

    }
}
