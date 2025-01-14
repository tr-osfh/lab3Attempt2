package prod.udntk.objects.inanimates;

import prod.udntk.enums.Color;
import prod.udntk.enums.SpaceLocation;

import java.util.Objects;

public final class Planet extends SpaceObject{

    public Planet(String name, SpaceLocation location, Color dye){
        super.setName(name);
        super.setLocation(location);
        super.setDye(dye);
    }

    public void illuminate(MoonObject obj){
        obj.setDye(this.getDye());
        System.out.println(this.getName() + " освещяет " + obj.getName() + obj.getDye().getType());

    }

    public void illuminate(){
        System.out.println(this.getName() + " освещяет " + this.getDye() + " светом");
    }

    public void move(){
        System.out.println(this.getName() + " перемещяется по небу");
    }

    @Override
    public String toString() {
        return "Planet{" +
                "designation" + getName() +
                "moves=" + moves +
                ", dye=" + this.getDye() +
                ", location=" + this.getLocation() +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLocation(), getDye());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Planet planet = (Planet) o;
        return this.getName() == planet.getName()
                && this.getDye() == planet.getDye()
                && this.getLocation() == planet.getLocation();
    }

}
