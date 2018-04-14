import java.util.Random;

public class Dice {
    private Random random = new Random();
    private int numberOfSides;

    public Dice(int numberOfSides) {
        // Initialize here the number of sides
        this.numberOfSides=numberOfSides;
    }

    public int roll() {
        // create here a random number belongig to range 1-numberOfSides
        return  random.nextInt(numberOfSides) + 1;
    }
}
