import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum=0;
        for (Integer integer : list) {
            sum+=integer;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double average = (sum(list))/(double)list.size();
        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double variance = 0;
        double average = average(list);
        for (Integer integer : list) {
            variance += Math.pow((integer-average),2);

        }
        variance = variance/(list.size()-1);
        return variance;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        //list.add(7);
        //list.add(3);
        
        System.out.println("The variance is: " + variance(list));
    //    System.out.println(average(list));
    }

}
