import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String yourName= reader.nextLine();
        
        int nameLength = yourName.length();
        int i=0;
        System.out.print("In reverse order: ");
        while(i<nameLength){
            i++;
            System.out.print(yourName.charAt(yourName.length()- i));
        }
        System.out.println("");
    }
}
