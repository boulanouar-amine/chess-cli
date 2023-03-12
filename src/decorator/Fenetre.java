package decorator;

public class Fenetre extends Decorator{


    Fenetre(ComposantMaison cm) {
        super(cm);
    }

    @Override
    void construire() {
        System.out.print("fenetre->");
        cm.construire();

    }
}
