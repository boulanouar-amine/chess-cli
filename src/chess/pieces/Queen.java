package chess.pieces;

import chess.logic.BaseMovement;
import chess.logic.Horizontal;
import chess.logic.MovePattern;
import chess.logic.Vertical;

public class Queen extends Piece {


    public Queen(String color) {
        super(color);
    }

    @Override
    public void movePattern(MovePattern movePattern) {
        setMovePattern(new Horizontal(new Vertical(new BaseMovement())));
    }


}
