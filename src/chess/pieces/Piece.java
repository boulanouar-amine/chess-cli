package chess.pieces;

import chess.Move;
import chess.Square;
import chess.logic.MovePattern;

public abstract class Piece {

    private Square square;
    private final String color;
    private MovePattern movePattern;
    public Piece(String color) {

        this.color = color;
        movePattern(movePattern);
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

    public abstract void movePattern(MovePattern movePattern);

    public void move(Square square){
        System.out.println(movePattern);
        movePattern.move(new Move(getSquare(),square));
    }

    public void setSquare(Square square) {
        this.square = square;
    }

    private Square getSquare() {
     return square;
    }

}
