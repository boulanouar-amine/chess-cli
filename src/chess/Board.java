package chess;


import chess.pieces.*;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private Player p1 = new Player("White");
    private Player p2 = new Player("Black");


    private static Board instance;
    private static Square[][] boardData = new Square[8][8];

    private Board() {

        initializeBoard();
    }
    private Board(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
        initializeBoard();
    }

    public static Board getBoard() {
        if (instance == null) instance = new Board();
        return instance;
    }

    public static Board getBoard(Player p1, Player p2) {
        if (instance == null) instance = new Board(p1,p2);
        return instance;
    }

    public Square getSquare(int x, int y) {

        if (x < 0 || x > 7 || y < 0 || y > 7) {
            System.out.println("index out of bounds");
        }

        return boardData[x][y];
    }


    public void afficher() {

        p1.afficher();
        System.out.println(" |\t=================================================================================================================================");

        for (int y = 0; y < 8; y++) {

            System.out.print(y +"|  ");


            for (int x = 0; x < 8; x++) {

                if (boardData[x][y].getPiece() != null) {
                    System.out.print( "|\t" + boardData[x][y].getPiece().getSymbol() + "\t");
                } else {
                   System.out.print("|---------------");
                }

            }


            System.out.println("|");
        }

        ArrayList<String> charlist = new ArrayList<>(List.of("a","b","c","d","e","f","g","h"));
        System.out.println(" |\t=================================================================================================================================");
        System.out.print(" |   ");
        for (String character: charlist) {

            System.out.print("\t\t" + character + "\t\t|");
        }

        p2.afficher();
    }

    private void initializePawns(int y, String color) {
        for (int i = 0; i < 8; i++) {
            boardData[i][y] = new Square(i, y, new Pawn(color));
        }
    }

    private void intializeOtherPieces(int y, String color) {

        boardData[0][y] = new Square(0, y, new Rook(color));
        boardData[1][y] = new Square(1, y, new Knight(color));
        boardData[2][y] = new Square(2, y, new Bishop(color));
        boardData[3][y] = new Square(3, y, new Queen(color));
        boardData[4][y] = new Square(4, y, new King(color));
        boardData[5][y] = new Square(5, y, new Bishop(color));
        boardData[6][y] = new Square(6, y, new Knight(color));
        boardData[7][y] = new Square(7, y, new Rook(color));

    }

    public void initializeBoard() {

        // initialize white pieces
        intializeOtherPieces(0, p1.getColor());

        //intializes the white pawns
        initializePawns(1, p1.getColor());

        // initialize the black pieces
        intializeOtherPieces(7, p2.getColor());

        //intializes the black pawns
        initializePawns(6, p2.getColor());

        // initialize remaining boardData without any piece
        for (int y = 2;  y < 6; y++) // 0-1 are the white pieces and 6-8 are the black pieces
        {
            for (int x = 0; x < 8; x++) {
                boardData[x][y] = new Square(x, y, null);
            }
        }

    }




}

