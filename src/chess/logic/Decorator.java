package chess.logic;

public abstract class Decorator extends MovePattern{

    MovePattern movePattern;

    protected int fromY,toY,fromX,toX;

    protected int maxDistance;

    Decorator(MovePattern movePattern){
        this.movePattern=movePattern;
    }

    public void setup(){

        // for the nested movements
        movePattern.move(getMove());

         fromY = getMove().getFrom().getY();
         toY = getMove().getTo().getY();

         fromX = getMove().getFrom().getX();
         toX = getMove().getTo().getX();



    }


}
