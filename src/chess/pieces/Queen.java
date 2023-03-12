package chess.pieces;

import chess.logic.BaseMovement;
import chess.logic.Diagonal;
import chess.logic.Horizontal;
import chess.logic.Vertical;

public class Queen extends Piece {


    public Queen(String color) {
        super(color);
    }

    @Override
    public void movePattern() {
        setMovePattern(new Diagonal(
                new Horizontal(new Vertical(new BaseMovement()))));
    }


}
