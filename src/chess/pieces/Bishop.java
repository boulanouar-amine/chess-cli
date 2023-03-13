package chess.pieces;

import chess.logic.BaseMovement;
import chess.logic.Diagonal;

public class Bishop extends Piece {


    public Bishop(String color) {
        super(color);
    }

    @Override
    public void movePattern() {
            setMovePattern(new Diagonal(new BaseMovement()));
    }


}
