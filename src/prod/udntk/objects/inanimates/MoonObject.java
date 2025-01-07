package prod.udntk.objects.inanimates;

import prod.udntk.enums.Color;
import prod.udntk.enums.GroundLocation;
import prod.udntk.objects.PhysicalObject;

import java.util.Objects;

public class MoonObject extends PhysicalObject {

    public MoonObject(){
        this.location = GroundLocation.NONE;
        this.dye = Color.NONE;
    }

    private GroundLocation location;
    private Color dye;

    @Override
    public void describe(){
        System.out.println(this.getName() + " виднеется в " + this.getLocation().getType());
    }


    public void changeColor(Color dye){
        this.setDye(dye);
        System.out.println(this.getName() + " меняет цвет на " + dye);
    }

    public void changeColor(SpaceObject lightSource){
        System.out.println(this.getName() + "освещен" + lightSource.getName());
    }

    public GroundLocation getLocation() {
        return location;
    }

    public void setLocation(GroundLocation location) {
        this.location = location;
    }

    public Color getDye() {
        return dye;
    }


    public void setDye(Color dye) {
        this.dye = dye;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MoonObject that = (MoonObject) o;
        return getName() == that.getName()
                && getDye() == that.getDye()
                && getLocation() == that.getLocation()
                && location == that.location
                && dye == that.dye;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLocation(), location, dye);
    }

    @Override
    public String toString() {
        return "MoonObject{" +
                "name=" + getName() +
                "location=" + location +
                ", dye=" + dye +
                ", moves=" + moves +
                '}';
    }
}
