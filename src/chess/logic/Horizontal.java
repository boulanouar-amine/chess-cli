package chess.logic;

import chess.Board;
import chess.Move;
import chess.pieces.Piece;

import java.util.Objects;

public class Horizontal extends Decorator{
    public Horizontal(MovePattern movePattern) {
        super(movePattern);
    }

    @Override
    public boolean isAvalidMove(Move move){

        movePattern.move(move);

        int fromX = move.getFrom().getX();
        int toX = move.getTo().getX();

        int fromY = move.getFrom().getY();
        int toY = move.getTo().getY();

        //checks for pieces between the move
        for (int x = fromX; x<toX ;x++) {

            Piece piece = Board.getBoard().getSquare(x,fromY).getPiece();

            if(piece != null && Objects.equals(piece.getColor(), move.getFrom().getPiece().getColor()))
                return false;
        }

        return  !(fromX < 0 || fromX > 7 || toX < 0 || toX > 7 || fromY!=toY );
    }

}
