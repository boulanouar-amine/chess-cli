package chess.pieces;

import chess.logic.BaseMovement;
import chess.logic.Horizontal;

public class Pawn extends Piece {


    public Pawn(String color) {
        super(color);
    }

    @Override
    public void movePattern() {
        setMovePattern(new Horizontal(new BaseMovement()));
    }


}
