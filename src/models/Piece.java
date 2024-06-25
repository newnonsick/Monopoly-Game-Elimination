package models;

public class Piece {
    private Square location;

    public Piece(Square location) {
        this.location = location;
    }

    public void setLocation(Square square) {
        this.location = square;
    }

    public Square getLocation() {
        return location;
    }
}