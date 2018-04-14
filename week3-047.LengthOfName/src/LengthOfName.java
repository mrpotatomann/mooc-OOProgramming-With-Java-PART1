
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // call your method from here
        System.out.println("Type yor name: ");
        String text = reader.nextLine();
        System.out.println("Number of characters: " + calculateCharacters(text));        
    }
    
    // do here the method
    public static int calculateCharacters(String text) {
        int calculateCharacters = text.length();
        return calculateCharacters;
    }
    
    
}
