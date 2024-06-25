package models.collections;
import models.Player;
import java.util.ArrayList;
import java.util.List;

public class PlayerList {
    private List<Player> players;

    public PlayerList() {
        players = new ArrayList<Player>();
    }

    public void addPlayer(Player player) {
        if (players.size() >= 8) {
            throw new IllegalArgumentException("The number of players must be between 2 and 8");
        }
        players.add(player);
    }

    public List<Player> getPlayers() {
        return players;
    }
}
