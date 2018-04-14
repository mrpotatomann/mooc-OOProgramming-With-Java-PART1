
public class Main {

    public static void main(String[] args) {
        // Test your code here!
        Money a = new Money(20,0);
        Money b = new Money(35,0);

        
        Money c = a.plus(b);
        
        System.out.println(c);
        
        a = a.plus(b);
        
        System.out.println(a);
        System.out.println(b);
        
        Money r1 = new Money(10, 0);
        Money r2 = new Money(7, 50);
        Money r3 = r1.minus(r2);
        
        
        System.out.println(r3.euros());
        
    }
}
