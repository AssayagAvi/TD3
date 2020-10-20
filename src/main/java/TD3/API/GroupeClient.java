package TD3.API;

import java.util.Collection;

public class GroupeClient implements PrePostVisitable, Visitable {
    public String name;
    public Collection <Client> clients;

    public GroupeClient(String name) {
        this.name = name;
    }
    public void addClient(Client c){

    }
    public void addCommande(String name, Commande c) {
    }

    public void addLigne(String a, String b, Ligne l){

    }

    public void accept(PrePostVisitor ppv){

    }
    public void accept(Visitor v){

    }
}

