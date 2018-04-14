
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4
        /*       NumberStatistics stats = new NumberStatistics();
        System.out.println("Type numbers:");        
        while (true) { 
            int userInput=Integer.parseInt(reader.nextLine());
            if(userInput!=-1){
                stats.addNumber(userInput);
            } else{
                break;
            }
        }   
        System.out.println("sum: " + stats.sum());
         */

        NumberStatistics stats = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();

        System.out.println("Type numbers:");
        while (true) {
            int userInput = Integer.parseInt(reader.nextLine());
            
            if (userInput != -1) {
                stats.addNumber(userInput);
                
                if (userInput % 2 == 0) {
                    even.addNumber(userInput);
                } else if (userInput % 2 == 1) {
                    odd.addNumber(userInput);
                }

            } else {
                break;
            }
        }
        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());

        /*       stats.addNumber(3);
        stats.addNumber(5);
        stats.addNumber(2);

        
        System.out.println("Amount: " + stats.amountOfNumbers());
        System.out.println("Sum: " + stats.sum());
        System.out.println("Average: " + stats.average());

         */
    }
}
