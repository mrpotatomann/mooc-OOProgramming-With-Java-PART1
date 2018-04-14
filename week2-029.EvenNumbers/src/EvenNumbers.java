
public class EvenNumbers {

    public static void main(String[] args) {
        // Write your code here
        int number = 1;

        while (number >= 1 && number<=100) {
            number++;
            if(number%2==0){
                System.out.println(number);
            }
            /*  or  System.out.println(number);
            number = number + 2;      */
            
                    
        }
    }
}
