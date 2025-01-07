package prod.udntk.objects.inanimates;

import prod.stuff.exceptions.WrongMovement;
import prod.udntk.enums.Color;
import prod.udntk.enums.GroundLocation;
import prod.udntk.enums.SpaceLocation;
import prod.udntk.objects.PhysicalObject;

import java.util.Objects;

public class SpaceObject extends PhysicalObject {
    public SpaceObject(){
        this.dye = Color.NONE;
        this.location = SpaceLocation.NONE;
    }

    private SpaceLocation location;
    private Color dye;

    @Override
    public void describe(){
        System.out.println(this.getName() + " где то высоко над головой");
    }

    public SpaceLocation getLocation() {
        return location;
    }

    public void setLocation(SpaceLocation location) {
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
        SpaceObject that = (SpaceObject) o;
        return location == that.location &&
                dye == that.dye;
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, getName(), getLocation(), getDye());
    }

    @Override
    public String toString() {
        return "SpaceObject{" +
                "moves=" + moves +
                ", dye=" + dye +
                ", location=" + location +
                '}';
    }
}
