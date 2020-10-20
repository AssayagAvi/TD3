package TD3.API;

public class Client implements PrePostVisitable, Visitable {
    public String name;

    public Client(String name) {
        this.name = name;
    }

    public void addCommande(Commande c){

    }

    public void addLigne(String a, Ligne l){

    }

    public void accept(PrePostVisitor ppv){

    }

    public void accept(Visitor v){

    }
}
