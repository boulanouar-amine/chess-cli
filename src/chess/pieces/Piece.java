package chess.pieces;

import chess.Move;
import chess.Square;
import chess.logic.BaseMovement;
import chess.logic.MovePattern;

public abstract class Piece {

    private Square square;
    private final String color;
    private MovePattern movePattern;
    public Piece(String color) {

        this.color = color;
        setMovePattern(new BaseMovement());
    }

    public String getColor() {
        return color;
    }

    public String getSymbol() {
        return color + "-" + getClass().getSimpleName();
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

    public void setSquare(Square square) {
        this.square = square;
    }

    private Square getSquare() {
     return square;
    }

}
