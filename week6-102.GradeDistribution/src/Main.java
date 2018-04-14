
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GradesAndPoints gandp = new GradesAndPoints();
        Scanner reader = new Scanner(System.in);

        System.out.println("Type exam scores, -1 completes: ");
        gandp.addPoints(reader);
        gandp.convertDynamicList();
        gandp.sortPointsIntoGrades();
        gandp.printStars();

        System.out.println("Acceptance percentage: " + gandp.acceptancePercentage());
    }
}
