
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here 
        System.out.println("Type the radius: ");
        int radiusNumber = Integer.parseInt(reader.nextLine());
        double circumference = 2 * Math.PI * radiusNumber;
        System.out.println("Circumference of the circle: " + circumference);
    }
}
