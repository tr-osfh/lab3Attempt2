package prod.udntk.objects.inanimates;

import prod.stuff.exceptions.SameObjException;
import prod.udntk.enums.Color;
import prod.udntk.enums.Light;
import prod.udntk.enums.SpaceLocation;

public final class Star extends SpaceObject{

    public Star(String name, SpaceLocation location, Color dye, Light light){
        super.setName(name);
        super.setLocation(location);
        super.setDye(dye);
        this.setLight(light);
    }

    private Light light;

    public void illuminate(){
        System.out.println(this.getName() + " освещяет " + this.getDye().getType() + " светом");
    }

    public void illuminate(MoonObject obj) throws SameObjException{
        if (obj.equals(this)){
            throw new SameObjException("");
        } else {
            obj.setDye(this.getDye());
            System.out.println(this.getName() + " освещяет " + obj.getName() + " " + obj.getDye().getType());
            System.out.println("лучи " + getLight().getType());

            System.out.printf("\nтеперь %s %s\n\n", obj.getName(), obj.getDye().getType());
        }

    }

    public Light getLight() {
        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }
}
