package chess;


import chess.pieces.Piece;

public  class Move {
    private Square from;
    private Square to;

    public Move(Square from, Square to) {
        this.from=from;
        this.to=to;
    }

    @Override
    public String toString() {
        return "Move{" +
                "from=" + from +
                ", to=" + to +
                '}';
    }

    public Square getFrom() {
        return from;
    }

    public Square getTo() {
        return to;
    }

    public void move(Square fromSquare, Square toSquare) {

        Piece piece = fromSquare.getPiece();

        fromSquare.setPiece(null);
        toSquare.setPiece(piece);
    }

    public void move() {
       move(from,to);
    }


}
