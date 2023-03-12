package chess.logic;

public abstract class Decorator extends MovePattern{

    MovePattern movePattern;

    Decorator(MovePattern movePattern){
        this.movePattern=movePattern;
    }

}
