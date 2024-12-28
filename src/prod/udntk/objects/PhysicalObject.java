package prod.udntk.objects;

import prod.stuff.Moves;

import java.util.ArrayList;

public abstract class PhysicalObject {
    private String name;

    public PhysicalObject(){
        this.name = "";
    }

    public abstract void describe();

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    protected ArrayList<Moves> moves = new ArrayList<Moves>();

    public void addMove(Moves move){
        this.moves.add(move);
    }

    public void getMoves(int id){
        System.out.println(moves.get(id));
    }
}
