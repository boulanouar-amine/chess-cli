package chess;


import chess.pieces.Piece;

public class Game {




    public static void main(String[] args) {



        Player p1 = new Player("amine","red");
        Player p2 = new Player("blue");

        Board board = Board.getBoard(p1,p2);

        Piece rook = board.getSquare(0, 0).getPiece();

        Square square2 = board.getSquare(3, 7);

        rook.move(square2);






        //todo set move following chess notation for exampe move("e4") => move("46","44")

        board.afficher();
    }

}
