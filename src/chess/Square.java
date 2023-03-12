package chess;

import chess.pieces.Piece;

public class Square {
    private int x;
    private int y;
    private Piece piece;

    public Square(int x, int y, Piece piece) {
        this.x = x;
        this.y = y;
        this.piece = piece;
        if(piece!=null) this.piece.setSquare(this);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Piece getPiece() {
        return piece;
    }

    public Square getSquare(){
        return this;
    }
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    private String  getXvalue(){

        return switch (x) {
            case 0 -> "a";
            case 1 -> "b";
            case 2 -> "c";
            case 3 -> "d";
            case 4 -> "e";
            case 5 -> "f";
            case 6 -> "g";
            case 7 -> "h";
            default -> "";

        };
    }
    @Override
    public String toString() {
        return "Square{" +
                "x=" + getXvalue() +
                ", y=" + y +
                ", piece=" + piece +
                '}';
    }
}
