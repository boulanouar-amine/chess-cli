package decorator;

public class Main {

    public static void main(String[] args) {

        ComposantMaison fondation = new Fondation();
        ComposantMaison porte = new Porte(fondation);
        ComposantMaison fenetre = new Fenetre(porte);

        fenetre.construire();
        System.out.println();


        ComposantMaison porteFenetreFondation = new Porte(new Fenetre(new Fondation()));


        porteFenetreFondation.construire();
    }
}
