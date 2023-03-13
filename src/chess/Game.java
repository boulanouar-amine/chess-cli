package chess;


import chess.pieces.Piece;

public class Game {




    public static void main(String[] args) {



        Player p1 = new Player("test","black");
        Player p2 = new Player("green");

        Board board = Board.getBoard(p1,p2);

        Piece rook = board.getSquare(0, 0).getPiece();
        Piece pawn = board.getSquare(0, 1).getPiece();
        Piece bluePawn = board.getSquare(4, 6).getPiece();



        Square square4 = board.getSquare(0, 5);

        System.out.println("Pawn move");
        pawn.move(square4);

        System.out.println("Rook move to a3");
        rook.move("a3");
        System.out.println("Rook move to b4");
//        rook.move("b3");
        System.out.println("blue pawn move to e4");


        System.out.println("moves the red pawn to clear for the bishop");


        //todo set move following chess notation for exampe move("e4") => move("46","44")

        board.afficher();
    }

}
