package chess.logic;

import chess.Move;

public class Vertical extends Decorator{
    public Vertical(MovePattern movePattern) {
        super(movePattern);
    }

    @Override
    public boolean isAvalidMove(Move move){

        movePattern.move(move);

        int fromX = move.getFrom().getX();
        int toX = move.getTo().getX();

        int fromY = move.getFrom().getY();
        int toY = move.getTo().getY();

        return  !(fromX < 0 || fromX > 7 || toX < 0 || toX > 7 || fromY!=toY );
    }

}
