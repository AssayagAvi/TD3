package TD3.API;

import java.util.HashMap;
import java.util.Map;

public class Client implements PrePostVisitable, Visitable {
    public String name;
    public final Map<String,Commande> commandes;

    public Client(String name) {
        this.name = name;
        this.commandes=new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCommande(Commande commandes){
        this.commandes.put(commandes.getName(),commandes);

    }

    public void addLigne(String commandes, Ligne lignes){
        this.commandes.get(commandes).addLigne(lignes);

    }

    public void accept(PrePostVisitor ppv){

    }

    public void accept(Visitor v){

    }
}
