import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Top ten players based on goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.println("  \n   \n  \n");
        

        System.out.println("Top 25 players based on penalty amount");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        System.out.println("  \n  \n  \n");        
        
        System.out.println("Statistics for Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        System.out.println("  \n   \n  \n");

        System.out.println("Statistics for Philadelphia Flyers");
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();
        System.out.println("  \n   \n  \n");
        
        System.out.println("The players in Anaheim Ducks sorted by points");
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();
        

        
    }
}
