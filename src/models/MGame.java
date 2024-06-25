package models;

import models.collections.Dice;
import models.collections.PlayerList;

import java.util.List;

public class MGame {
    private final PlayerList players;
    private final Board board;
    private int roundCount;
    private final Dice dice;

    public MGame(PlayerList players, Board board, Dice dice) {
        if (players.getPlayers().size() < 2 || players.getPlayers().size() > 8) {
            throw new IllegalArgumentException("The number of players must be between 2 and 8");
        }

        this.players = players;
        this.board = board;
        this.dice = dice;
        roundCount = 0;
    }

    public void playGame(int n) {
        while (roundCount < n) {
            playRound();
        }
    }

    private void playRound() {
        List<Player> players = this.players.getPlayers();
        for (Player player : players) {
            player.takeTurn();
        }
        roundCount++;
    }
}