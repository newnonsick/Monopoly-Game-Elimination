import models.Board;
import models.MGame;
import models.Player;
import models.collections.Dice;
import models.collections.PlayerList;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();

        Dice dice = new Dice();

        PlayerList players = new PlayerList();
        players.addPlayer(new Player(dice, "Player 1",  board));
        players.addPlayer(new Player(dice, "Player 2",  board));
        players.addPlayer(new Player(dice, "Player 3",  board));

        MGame game = new MGame(players, board, dice);
        game.playGame(10);
    }
}
