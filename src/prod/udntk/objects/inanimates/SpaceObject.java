package prod.udntk.objects.inanimates;

import prod.stuff.exceptions.WrongMovement;
import prod.udntk.enums.Color;
import prod.udntk.enums.GroundLocation;
import prod.udntk.enums.SpaceLocation;
import prod.udntk.objects.PhysicalObject;

public class SpaceObject extends PhysicalObject {
    public SpaceObject(){
        this.dye = Color.NONE;
        this.location = SpaceLocation.NONE;
    }

    private SpaceLocation location;
    private Color dye;

    @Override
    public void describe(){
        System.out.println(this.getName() + " есть на поверхности");
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
}
