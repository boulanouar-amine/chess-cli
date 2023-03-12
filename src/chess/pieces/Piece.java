package chess.pieces;

import chess.Move;
import chess.Square;
import chess.logic.MovePattern;

public abstract class Piece {

    private Square square;
    private String color;
    private MovePattern movePattern;
    public Piece(String color) {

        this.color = color;
        movePattern();
    }

    public String getColor() {
        return color;
    }

    public String getSymbol() {
        if ( color.trim().length()>4 )
            color = color.trim().toLowerCase().substring(0,4);
        return  color + "-" + getClass().getSimpleName();
    }

    public MovePattern getMovePattern() {
        return movePattern;
    }

    public void setMovePattern(MovePattern movePattern){
        this.movePattern=movePattern;
    }

    public abstract void movePattern();

    public void move(Square square){

        movePattern.move(new Move(getSquare(),square));
    }

    public void move(String string){

        movePattern.move(new Move(getSquare(),Square.fromString(string)));
    }

    public void setSquare(Square square) {
        this.square = square;
    }

    private Square getSquare() {
     return square;
    }

}
