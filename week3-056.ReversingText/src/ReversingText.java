
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        int i=0;
        
        String backwardsHelp = "";
        int characterPlace = text.length()-1;
        while(i<=characterPlace){
            backwardsHelp = backwardsHelp + text.charAt(characterPlace);
            characterPlace--;
        }
        return backwardsHelp;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
