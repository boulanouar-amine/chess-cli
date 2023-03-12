package chess.pieces;

import chess.logic.BaseMovement;
import chess.logic.Vertical;

public class Pawn extends Piece {


    public Pawn(String color) {
        super(color);
    }

    @Override
    public void movePattern() {
        setMovePattern(new Vertical(new BaseMovement()));
    }



}
