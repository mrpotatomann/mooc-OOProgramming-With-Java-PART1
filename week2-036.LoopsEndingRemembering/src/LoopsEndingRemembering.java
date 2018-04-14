
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);

        System.out.println("Type numbers: ");

        int sum = 0;
        int count = 0;
        double avg = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;

        while (true) {
            int numbers = Integer.parseInt(reader.nextLine());
            if (numbers == -1) {
                break;
            } else {

                sum = sum + numbers;
                count++;
                avg = (double) sum / count;

                if (numbers % 2 == 0) {
                    evenNumbers++;
                } else {
                    oddNumbers++;
                }

            }
        }

        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count);
        System.out.println("Average: " + avg);
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }
}
