
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        int firstNumber = 1;
        System.out.println("Up to what number?");
        int centerNumber = Integer.parseInt(reader.nextLine());
        while (firstNumber<=centerNumber) {
            System.out.println(firstNumber);
            firstNumber++;
        }
    }
}
