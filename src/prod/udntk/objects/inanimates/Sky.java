package prod.udntk.objects.inanimates;

import prod.stuff.Moves;
import prod.udntk.enums.Color;
import prod.udntk.enums.SpaceLocation;

import java.util.Objects;

public final class Sky extends SpaceObject{

    public Sky(Color dye){
        super.setName("Небо");
        super.setLocation(SpaceLocation.CLOSESPACE);
        super.setDye(dye);
        super.moves.add(new Moves("Описание неба", "Над головой небо"));
    }

    @Override
    public void describe(){
        System.out.printf("Облака медленно плывут по %s небу. \n", this.getDye().getType());
    }

    public void changeColor(Color dye){
        this.setDye(dye);
        System.out.println(this.getName() + " меняет цвет на " + dye);
    }

    @Override
    public String toString() {
        return "Sky{" +
                "name=" + getName() +
                "location=" + getLocation() +
                "dye=" + getDye() +
                "moves=" + moves +
                '}';
    }

    @Override
    public int hashCode(){
        return Objects.hash(getName(), getLocation(), getDye(), moves);
    }
}
