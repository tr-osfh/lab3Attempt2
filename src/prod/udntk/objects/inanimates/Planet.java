package prod.udntk.objects.inanimates;

import prod.udntk.enums.Color;
import prod.udntk.enums.SpaceLocation;
import prod.udntk.objects.PhysicalObject;

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
}
