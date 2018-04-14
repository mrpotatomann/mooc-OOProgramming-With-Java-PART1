import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private Random random = new Random();
    private int length;

    

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length=length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String createPassword = "";
        int helper=0;
        while (helper<length) {            
            createPassword = createPassword + "abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(26));
            helper++;
        }
        return createPassword;
    }
}
