package chess.logic;

import chess.Board;
import chess.pieces.Piece;

public class Vertical extends Decorator{
    public Vertical(MovePattern movePattern) {
        super(movePattern);
    }

    @Override
    public boolean isAvalidMove(){

        setup();

        //checks for pieces between the move
        for (int y = fromY +1; y<=toY ;y++) {
            Piece piece = Board.getBoard().getSquare(fromX,y).getPiece();

             if(isSameColor(piece)) return false;
        }

        return !(fromY < 0 || fromY > 7 || toY < 0 || toY > 7 || fromX!=toX);
    }


}
