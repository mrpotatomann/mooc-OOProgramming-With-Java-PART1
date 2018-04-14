
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        System.out.println("Type your name: ");
        String firstName= reader.nextLine();
        System.out.println("Type your age: ");
        int firstNumber = Integer.parseInt(reader.nextLine());


        System.out.println("Type your name: ");
        String secondName = reader.nextLine();
        System.out.println("Type your age: ");
        
        int secondNumber = Integer.parseInt(reader.nextLine());
        int sumOfAges = firstNumber + secondNumber;
        System.out.println(firstName + " and " + secondName + " are " + sumOfAges + " years old in total.");
    }
}
