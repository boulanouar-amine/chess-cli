package chess.logic;

import chess.Board;
import chess.Move;

public class Vertical extends Decorator{
    public Vertical(MovePattern movePattern) {
        super(movePattern);
    }

    @Override
    public boolean isAvalidMove(Move move){


        int fromY = move.getFrom().getY();
        int toY = move.getTo().getY();

        int fromX = move.getFrom().getX();
        int toX = move.getTo().getX();

        for (int y = fromY; y<toY ;y++) {
            if((Board.getBoard().getSquare(fromX,y).getPiece()==null))
                return false;
        }

        return !(fromY < 0 || fromY > 7 || toY < 0 || toY > 7 || fromX!=toX);
    }


}
