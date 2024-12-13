package prod.udntk.objects.inanimates;

import prod.udntk.enums.Color;
import prod.udntk.enums.GroundLocation;

public final class Rock extends MoonObject {
    public Rock(String name, GroundLocation location, Color dye){
        super.setName(name);
        super.setLocation(location);
        super.setDye(dye);
    }
    public void shine(){
        System.out.println(this.getName() + " блестит " + this.getDye().getType());
    }
}
