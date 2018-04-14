
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String yourName = reader.nextLine();
        int i = 0;
        int numberOfCharacter = 1;
        int nameLength = yourName.length();
        while (i < nameLength) {
            
            System.out.println(numberOfCharacter + ". character: " + yourName.charAt(i));
            i++;
            numberOfCharacter++;
        }
    }
}
