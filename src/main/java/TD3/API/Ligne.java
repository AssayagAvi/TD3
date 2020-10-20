package TD3.API;

public class Ligne implements PrePostVisitable, Visitable{
    public int sum;
    public String name;

    public Ligne(String name) {
        this.name = name;
    }

    public Ligne(String name, int sum) {
        this.sum = sum;
        this.name = name;
    }

    public void accept(PrePostVisitor ppv){

    }
    public void accept(Visitor v){

    }
}
