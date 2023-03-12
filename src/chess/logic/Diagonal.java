package chess.logic;

import chess.Move;

public class Diagonal extends Decorator {

    Diagonal(MovePattern movePattern) {
        super(movePattern);
    }

    @Override
    public boolean isAvalidMove(Move move) {
        return true;
    }

    @Override
    public void move(Move move) {

    }
}
