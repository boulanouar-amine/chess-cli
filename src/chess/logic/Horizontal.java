package chess.logic;

import chess.Move;

public class Horizontal extends Decorator{
    public Horizontal(MovePattern movePattern) {
        super(movePattern);
    }

    @Override
    public boolean isAvalidMove(Move move){

        int fromX = move.getFrom().getX();
       int toX = move.getTo().getX();

        return fromX > 0 && fromX < 7 && fromX != toX && toX > 0 && toX < 7;
    }

}
