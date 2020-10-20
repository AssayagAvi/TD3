package TD3.API;

public class Commande implements PrePostVisitable, Visitable{
    public String name;

    public Commande(String name) {
        this.name = name;
    }

    public void addLigne(Ligne l){
    }

    public void accept(PrePostVisitor ppv) {
    }

    public void accept(Visitor v){

    }

    public String getName() {
        return name;
    }
}
