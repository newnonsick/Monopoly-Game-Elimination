package models;

import models.collections.Dice;

public class Player {
    private final Piece piece;
    private final Dice dice;
    private final String name;
    private final Board board;

    public Player(Dice dice, String name, Board board) {
        this.dice = dice;
        this.name = name;
        this.board = board;
        this.piece = new Piece(board.getStartSquare());
    }

    public void takeTurn() {
        int fvTot = throwDice();
        Square newSquare = board.getSquare(piece.getLocation(), fvTot);
        piece.setLocation(newSquare);
    }

    public int throwDice() {
        int total = 0;
        dice.rollAll();
        total = dice.getTotal();
        return total;
    }
}