
public class Main {

    public static void main(String[] args) {
        // Test your code here
        NightSky nightsky = new NightSky(0.5,40,20);
        nightsky.printLine();
        
        NightSky nightsky2 = new NightSky(8,4);
        nightsky2.print();
        
        System.out.println(nightsky2.starsInLastPrint());
    }
}
