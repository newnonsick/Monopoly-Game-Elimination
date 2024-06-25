package models.collections;

import models.Square;

public class SquareList {
private Square[] squares;

    public SquareList() {
        squares = new Square[40];
        for (int i = 0; i < squares.length; i++) {
            squares[i] = new Square("Square " + i);
        }
    }

    public Square getSquare(int index) {
        return squares[index];
    }

    public int getSize() {
        return squares.length;
    }

    public int getIndexOf(Square square) {
        for (int i = 0; i < squares.length; i++) {
            if (squares[i] == square) {
                return i;
            }
        }
        return -1;
    }
}
