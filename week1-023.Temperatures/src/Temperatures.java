
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        while (true) {
            System.out.println("Enter temperature");
            double value = Double.parseDouble(reader.nextLine());
            if (value < -30 || value > 40) {
                System.out.println("out of range re-enter");

            } else {
                Graph.addNumber(value);
            }
        }

        // Graph is used as follows:
        /*   Graph.addNumber(1);
        double value = 5;
        Graph.addNumber(value);
        value = 1;
        Graph.addNumber(value); */
        // Remove or comment out these lines above before trying to run the tests.
    }
}
