
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what?");
        int untilWhat = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int i = 1;
        while (i <= untilWhat) {

            sum += i;
            i++;
        }
        System.out.println("Sum is " + sum);
    }

}
