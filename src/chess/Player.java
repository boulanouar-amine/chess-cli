package chess;

public class Player {

    private String name = "anonymous";
    private String color = "White";

    Player(){}
    Player(String color){

        this.color = color;
    }
    Player(String name,String color){
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    void afficher(){
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\t " + getName() + " \t\t\t\t");
    }
}
