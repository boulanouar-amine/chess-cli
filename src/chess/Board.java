package chess;


import chess.pieces.*;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private Player p1;
    private Player p2;


    private static Board instance;
    private static Square[][] boardData = new Square[8][8];

    private Board() {
        p2.setColor("Black");
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

        return boardData[y][x];
    }


    public void afficher() {
        System.out.println("\t\t\t\t\t\t\t\t\t\t " + p1.getName() + " \t\t\t\t");
        for (int x = 0; x < 8; x++) {
            System.out.print(x +"|  ");
            for (int y = 0; y < 8; y++) {

                if (boardData[x][y].getPiece() != null) {
                    System.out.print(boardData[x][y].getPiece().getSymbol() + " ");
                } else {
                    System.out.print("------------");
                }

            }


            System.out.println();
        }

        ArrayList<String> charlist = new ArrayList<>(List.of("a","b","c","d","e","f"));

        for (String character: charlist) {

            System.out.print("\t\t" + character + "\t\t");
        }
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\t " + p2.getName() + " \t\t\t\t");
    }

    private void initializePawns(int x, String color) {
        for (int y = 0; y < 8; y++) {
            boardData[x][y] = new Square(x, y, new Pawn(color));
        }
    }

    private void intializeOtherPieces(int x, String color) {

        boardData[x][0] = new Square(x, 0, new Rook(color));
        boardData[x][1] = new Square(x, 1, new Knight(color));
        boardData[x][2] = new Square(x, 2, new Bishop(color));
        boardData[x][3] = new Square(x, 3, new Queen(color));
        boardData[x][4] = new Square(x, 4, new King(color));
        boardData[x][5] = new Square(x, 5, new Bishop(color));
        boardData[x][6] = new Square(x, 6, new Knight(color));
        boardData[x][7] = new Square(x, 7, new Rook(color));

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
        for (int x = 2; x < 6; x++) // 0-1 are the white pieces and 6-8 are the black pieces
        {
            for (int y = 0; y < 8; y++) {
                boardData[x][y] = new Square(x, y, null);
            }
        }

    }

    public void move(int fromX,int toX, int fromY,int toY) {

        Square fromSquare = getSquare(fromX,fromY);
        Square toSquare = getSquare(toX,toY);

        move(fromSquare,toSquare);

    }
    public void move(Square fromSquare, Square toSquare) {
        Piece piece = fromSquare.getPiece();

        fromSquare.setPiece(null);
        toSquare.setPiece(piece);
    }


}

