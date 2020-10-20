package TD3.API;

public interface Visitor extends  AbstractVisitor{

    void visit(GroupeClient gc);
    void visit(Client c );
    void visit(Commande c);
    void visit(Ligne l);
}
