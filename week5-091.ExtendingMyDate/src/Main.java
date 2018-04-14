
public class Main {

    public static void main(String[] args) {
        // test your code here
        MyDate mydate = new MyDate(25,2,2011);
   /*     int helper=0;
        while (helper<90) {            
            helper++;
            mydate.advance();
            System.out.println(mydate);
        }
        System.out.println(mydate);
    
    
        mydate.advance(20);
        System.out.println(mydate);
     */   
        System.out.println("");
        System.out.println("");
        
        MyDate newDate = mydate.afterNumberOfDays(7);
        for (int i = 1; i <= 7; i++) {
            System.out.println("Friday after " + i + " weeks is " + newDate);
            newDate=newDate.afterNumberOfDays(7);
        }
        System.out.println("This week's friday is " + mydate);
        System.out.println("The date 790 days from this week's Friday is " + mydate.afterNumberOfDays(790));
    }
}
