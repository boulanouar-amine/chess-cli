package decorator;

public class Fondation extends ComposantMaison{
    @Override
    void construire() {
        System.out.print("fondation");
    }
}
