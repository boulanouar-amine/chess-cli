package chess.logic;

import chess.Board;
import chess.pieces.Piece;

public class Horizontal extends Decorator{
    public Horizontal(MovePattern movePattern) {
        super(movePattern);
    }

    @Override
    public boolean isAvalidMove(){

        setup();

        //checks for pieces between the move
        for (int x = fromX+1; x<=toX ;x++) {

            Piece piece = Board.getBoard().getSquare(x,fromY).getPiece();

            if(isSameColor(piece)) return false;
        }


        return  !(fromX < 0 || fromX > 7 || toX < 0 || toX > 7 || fromY!=toY );
    }

}
