package chess.logic;

import chess.Board;
import chess.pieces.Piece;

public class Horizontal extends Decorator{
    public Horizontal(MovePattern movePattern) {
        super(movePattern);
    }

    @Override
    public boolean isAvalidMove(){

        movePattern.move(getMove());

        int fromX = getMove().getFrom().getX();
        int toX = getMove().getTo().getX();

        int fromY = getMove().getFrom().getY();
        int toY = getMove().getTo().getY();

        //checks for pieces between the move
        for (int x = fromX; x<toX ;x++) {

            Piece piece = Board.getBoard().getSquare(x,fromY).getPiece();
            if(isSameColor(piece)) return false;
        }

        return  !(fromX < 0 || fromX > 7 || toX < 0 || toX > 7 || fromY!=toY );
    }

}
