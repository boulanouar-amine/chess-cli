package chess.logic;

import chess.Move;

public class Vertical extends Decorator{
    public Vertical(MovePattern movePattern) {
        super(movePattern);
    }

    @Override
    public boolean isAvalidMove(Move move){

        int fromY = move.getFrom().getY();
        int toY = move.getTo().getY();

        return fromY > 0 && fromY < 7 && fromY != toY && toY > 0 && toY < 7;
    }


}
