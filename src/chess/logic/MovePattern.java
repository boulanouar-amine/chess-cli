package chess.logic;

import chess.Move;
import chess.pieces.Piece;

import java.util.Objects;


public abstract class MovePattern {

    private Move move;

    public Move getMove() {
        return move;
    }

    public abstract boolean isAvalidMove();
    public void move(Move move){
        this.move= move;
        if(isAvalidMove()) move.move();

        else{

            System.out.println(move);
            System.out.println("non valid move");
        }

    }


    public boolean isSameColor(Piece piece){

        if (piece==null)
            return false;

        Piece targetPiece = move.getFrom().getPiece();

        return Objects.equals(piece.getColor(), targetPiece.getColor());
    }


}
