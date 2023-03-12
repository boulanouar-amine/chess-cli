package decorator;

public abstract class Decorator extends ComposantMaison{


    protected ComposantMaison cm;



    Decorator(ComposantMaison cm){
        this.cm=cm;
    }



}
