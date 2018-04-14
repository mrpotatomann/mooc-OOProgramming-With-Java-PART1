public class Main {
    public static void main(String[] args) {
        // test your code here

         Team barcelona = new Team("FC Barcelona");
         System.out.println("Team: " + barcelona.getName());
         barcelona.setMaxSize(5);
         
         Player brian = new Player("Brian");
         System.out.println(brian);
         
         
         Player pekka = new Player("Pekka",20);
         System.out.println(pekka);
         System.out.println("");
         
         barcelona.addPlayer(brian);
         barcelona.addPlayer(pekka);
         barcelona.addPlayer(new Player("Bence",25));
         
         System.out.println("Number of players: "+barcelona.size());
         barcelona.printPlayers();
         System.out.println("Total goals: " + barcelona.goals());
    }
}
