import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String word= reader.nextLine();
        System.out.println("Length of the end part: ");
        int endPart = Integer.parseInt(reader.nextLine());
        System.out.println("Result: " + word.substring((word.length())-endPart));
        
        //With input Java 3 your program should print "Result: ava"
    }
}
