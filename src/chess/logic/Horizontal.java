package chess.logic;

import chess.Move;

public class Horizontal extends Decorator{
    public Horizontal(MovePattern movePattern) {
        super(movePattern);
    }

    @Override
    public boolean isAvalidMove(Move move){


        int fromY = move.getFrom().getY();
        int toY = move.getTo().getY();

        int fromX = move.getFrom().getX();
        int toX = move.getTo().getX();

        return !(fromY < 0 || fromY > 7 || toY < 0 || toY > 7 || fromX!=toX);
    }


}
