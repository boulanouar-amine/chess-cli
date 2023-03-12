package chess.logic;

import chess.Move;


public abstract class MovePattern {


    public abstract boolean isAvalidMove(Move move);
    public void move(Move move){
        if(isAvalidMove(move)) move.move();
        else System.out.println("non valid move");
    }


}
