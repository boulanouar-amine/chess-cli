package chess.pieces;


public abstract class Piece {

    private final String color;

    public Piece(String color) {
        this.color = color;
    }

    public String getSymbol() {
        return color + "-" + getClass().getSimpleName();
    }

    //strategie design pattern allows decoupeling of mouvement with the piece


}
