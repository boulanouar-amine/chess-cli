package decorator;

public class Porte extends Decorator{

    Porte(ComposantMaison cm) {
        super(cm);
    }

    @Override
    void construire() {
        System.out.print("Porte->");
        cm.construire();
    }
}
