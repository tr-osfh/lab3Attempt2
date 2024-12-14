package prod.udntk.objects.inanimates;

import prod.udntk.enums.Color;
import prod.udntk.enums.GroundLocation;
import prod.udntk.objects.PhysicalObject;

public class MoonObject extends PhysicalObject {

    public MoonObject(){
        this.location = GroundLocation.NONE;
        this.dye = Color.NONE;
    }

    private GroundLocation location;
    private Color dye;

    public void changeColor(Color dye){
        this.setDye(dye);
        System.out.println(this.getName() + " меняет цвет на " + dye);
    }

    public void changeColor(SpaceObject lightSource){
        System.out.println(this.getName() + "освещен" + lightSource.getName());
    }

    @Override
    public void describe(){
        System.out.println(this.getName() + " виднеется в " + this.getLocation().getType());
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
}
