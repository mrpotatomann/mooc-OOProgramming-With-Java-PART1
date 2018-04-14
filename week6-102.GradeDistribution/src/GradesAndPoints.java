
import java.util.ArrayList;
import java.util.Scanner;

public class GradesAndPoints {

    private int[] points;
    private int[] grades;
    private ArrayList<Integer> dynamiclist;
    private int accepted;

    public GradesAndPoints() {
        this.dynamiclist = new ArrayList<Integer>();
        this.grades = new int[6];
        this.accepted = 0;
    }

    public void addPoints(Scanner reader) {

        while (true) {
            int point = Integer.parseInt(reader.nextLine());
            if (point >= 0 && point <= 60) {
                dynamiclist.add(point);
            } else if (point == -1) {
                break;
            }
        }
    }

    public int[] convertDynamicList() {
        this.points = new int[dynamiclist.size()];

        for (int i = 0; i < points.length; i++) {
            points[i] = dynamiclist.get(i).intValue();
        }

        return points;
    }

//    public void addPoints2() {
//        System.out.println("Write a number: ");
//        int i = 0;
//        while (true) {
//
//            int point = Integer.parseInt(reader.nextLine());
//            if (point != -1) {
//                points[i] = point;
//            } else {
//                break;
//            }
//            i++;
//        }
//    }
    public void printPoints() {
        for (int i = 0; i < points.length; i++) {
            System.out.print(points[i] + " ");
        }
    }

    public void sortPointsIntoGrades() {
        for (int i = 0; i < points.length; i++) {
            if (points[i] >= 0 && points[i] < 30) {
                grades[0]++;
            } else if (points[i] < 35) {
                grades[1]++;
                accepted++;
            } else if (points[i] < 40) {
                grades[2]++;
                accepted++;
            } else if (points[i] < 45) {
                grades[3]++;
                accepted++;
            } else if (points[i] < 50) {
                grades[4]++;
                accepted++;
            } else if (points[i] <= 60) {
                grades[5]++;
                accepted++;
            }
        }
    }

    public void printSortedGrades() {
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i] + " ");
        }
    }

    public void printStars() {
        System.out.println("Grade distribution:");
        String star = "*";
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            String repeatedStar = new String(new char[grades[i]]).replace("\0", star);
            System.out.println(repeatedStar);

        }
    }

    public double acceptancePercentage() {
        if (points.length > 0) {
            double acceptancePercentage = 100 * accepted / points.length;
            return acceptancePercentage;
        } else {
            return 0;
        }
    }

}
