// This is not an exercise but a "sandbox" where you can freely test
// whatever you want

import java.util.Random;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        int helper = 0;
        System.out.println("length?");
        int length = Integer.parseInt(reader.nextLine());
        String text = "";

        //  char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(26));
        while (helper < length) {
            text = text + "abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(26));
            helper++;
        }
        System.out.println(text);

    }

}
