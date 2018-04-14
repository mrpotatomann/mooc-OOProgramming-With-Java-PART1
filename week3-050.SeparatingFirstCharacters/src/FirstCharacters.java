
import java.util.Scanner;

public class FirstCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String yourName = reader.nextLine();

        int calculateCharacters = yourName.length();

        if (calculateCharacters >= 3) {
            char firstCharacter = yourName.charAt(0);
            char secondCharacter = yourName.charAt(1);
            char thirdCharacter = yourName.charAt(2);
            System.out.println("1. character: " + firstCharacter);

            System.out.println("2. character: " + secondCharacter);

            System.out.println("3. character: " + thirdCharacter);
        } else {

        }
    }
}
