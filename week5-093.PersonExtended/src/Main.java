
import java.util.Calendar;


public class Main {
  public static void main(String[] args) {
    // write test code here
     Person pekka = new Person("Pekka", 15, 2, 1993);
     Person steve = new Person("Steve", 16, 2, 1993);
     Person jarmo = new Person("Jarmo", 15, 9, 1954);
     Person petteri = new Person("Petteri", 4, 4, 1978);
     
      System.out.println(pekka.getName() + "'s age is " + pekka.age() + " years");
      System.out.println("");
      
      System.out.println(pekka.getName() + " is older than " + steve.getName() + ": " + pekka.olderThan(steve));
      System.out.println(steve.getName() + " is older than " + pekka.getName() + ": " + steve.olderThan(pekka));
      
      
  }
}
