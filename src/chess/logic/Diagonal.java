package chess.logic;

import chess.Board;
import chess.pieces.Piece;

public class Diagonal extends Decorator {

    public Diagonal(MovePattern movePattern) {
        super(movePattern);
    }

    @Override
    public boolean isAvalidMove() {


            setup();

            //checks for pieces between the move
            for (int y = fromY +1; y<=toY ;y++) {
                for (int x = fromX+1 ;x<=toX;x++)
                {
                    Piece piece = Board.getBoard().getSquare(x,y).getPiece();

                    if(isSameColor(piece)) return false;
                }
            }

            return !(fromY < 0 || fromY > 7 || toY < 0 || toY > 7 || fromX!=toX || fromY!=toY);
        }
    }



