package chess;


public class Game {




    public static void main(String[] args) {



        Player p1 = new Player("amine","red");
        Player p2 = new Player("blue");

        Board board = Board.getBoard(p1,p2);


        Square square1 = board.getSquare(1, 1);

        Square square2 = board.getSquare(1, 2);

        board.move(square1, square2);
        board.move(1,3, 1,4);

        board.afficher();
    }

}
