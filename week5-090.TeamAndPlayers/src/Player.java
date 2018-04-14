public class Player {

    private String playerName;
    private int playerGoals;
    
    public Player(String playerName,int playerGoals){
        this.playerName=playerName;
        this.playerGoals=playerGoals;
    }
    
    public Player(String playerName){
        this.playerName=playerName;
        this.playerGoals=0;
    }
    
    public int goals(){
        return this.playerGoals;
    }
    
    public String getName(){
        return this.playerName;
    }
    
    public String toString(){
        return "Player: " + this.playerName + ", goals " + this.playerGoals; 
    }
}
