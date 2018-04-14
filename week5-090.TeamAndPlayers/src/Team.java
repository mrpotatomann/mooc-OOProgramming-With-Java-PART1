
import java.util.ArrayList;

public class Team {

    private String teamName;
    private ArrayList<Player> teamPlayers;
    private int maxSize;

    public Team(String teamName) {
        this.teamName = teamName;
        this.teamPlayers = new ArrayList<Player>();
        this.maxSize = 16;
    }

    public void addPlayer(Player player) {
        if (teamPlayers.size()+1 <= maxSize) {
            this.teamPlayers.add(player);
        } else {
        }
    }
    
    public int goals(){
        int goals=0;
        for (Player teamPlayer : teamPlayers) {
            goals += teamPlayer.goals();
        }
        
        return goals;
    }

    public void printPlayers() {
        for (Player teamPlayer : teamPlayers) {
            System.out.println(teamPlayer);
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return teamPlayers.size();
    }

    public String getName() {
        return teamName;
    }
}
