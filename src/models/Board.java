package models;

import models.collections.SquareList;

public class Board {
    private final SquareList squares;

    public Board() {
        this.squares = new SquareList();
    }

    public Square getSquare(Square oldSquare, int fvTot) {
        int index = squares.getIndexOf(oldSquare);
        int newIndex = (index + fvTot) % squares.getSize();
        return squares.getSquare(newIndex);
    }

    public Square getStartSquare() {
        return squares.getSquare(0);
    }
}
