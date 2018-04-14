
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a year: ");
        int leapYear = Integer.parseInt(reader.nextLine());
        
        if((leapYear%4==0) && !((leapYear%100==0) && !(leapYear%400==0))){ //néggyel osztható és csak akkor valósul meg, ha nem igaz az, hogy(100-al osztható, de 400-al nem)
            System.out.println("The year is a leap year.");
        }   else {
            System.out.println("The year is not a leap year.");
        }
    }
}
