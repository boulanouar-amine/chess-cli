package chess.logic;

import chess.Board;
import chess.pieces.Piece;

public class Vertical extends Decorator{
    public Vertical(MovePattern movePattern) {
        super(movePattern);
    }

    @Override
    public boolean isAvalidMove(){

        movePattern.move(getMove());

        int fromY = getMove().getFrom().getY();
        int toY = getMove().getTo().getY();

        int fromX = getMove().getFrom().getX();
        int toX = getMove().getTo().getX();

        for (int y = fromY +1; y<=toY ;y++) {
            Piece piece = Board.getBoard().getSquare(fromX,y).getPiece();

             if(isSameColor(piece)) return false;
        }

        return !(fromY < 0 || fromY > 7 || toY < 0 || toY > 7 || fromX!=toX);
    }


}
