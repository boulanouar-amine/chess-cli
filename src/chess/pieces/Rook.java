package chess.pieces;

import chess.logic.BaseMovement;
import chess.logic.Horizontal;
import chess.logic.Vertical;

public class Rook extends Piece {


    public Rook(String color) {
        super(color);
    }

    @Override
    public void movePattern() {
        setMovePattern(new Horizontal(new Vertical(new BaseMovement())));
    }


}

