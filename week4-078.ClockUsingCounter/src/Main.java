
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // write here code to ensure that BoundedCounter works as expected
        // before starting 78.3 remove the extra code and use the skeleton shown
        // in the assignment
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);
        
        
        System.out.println("Seconds: ");
        int s = Integer.parseInt(reader.nextLine());
        System.out.println("Minutes: ");
        int m = Integer.parseInt(reader.nextLine());
        System.out.println("Hours: ");
        int h = Integer.parseInt(reader.nextLine());
        
        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);
        
        int i=0;
        while(i<200){
            i++;
            System.out.println(hours + ":" + minutes + ":" + seconds);
            if(seconds.getValue()<60){
                seconds.next();
            }
            if(seconds.getValue()==0){
            minutes.next();
            }
            if(minutes.getValue()==0 && seconds.getValue()==0){
                hours.next();
            }

        }
        
    }
}
