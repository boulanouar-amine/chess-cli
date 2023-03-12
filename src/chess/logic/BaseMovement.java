package chess.logic;

import chess.Move;

public class BaseMovement extends MovePattern {

    @Override
    public boolean isAvalidMove(Move move) {
        return false;
    }
}
