package prod.udntk.objects.inanimates;

import prod.udntk.enums.Color;
import prod.udntk.enums.Light;
import prod.udntk.enums.SpaceLocation;

import java.util.Objects;

public final class Star extends SpaceObject{

    public Star(String name, SpaceLocation location, Color dye, Light light){
        super.setName(name);
        super.setLocation(location);
        super.setDye(dye);
        this.setLight(light);
    }

    private Light light;

    @Override
    public void describe(){
        System.out.println("Звезды сверкают в небе");
    }

    public void illuminate(){
        System.out.println(this.getName() + " освещяет " + this.getDye().getType() + " светом");
    }

    public void illuminate(MoonObject obj){
            obj.setDye(this.getDye());
            System.out.println(this.getName() + " освещяет " + obj.getName() + " " + obj.getDye().getType());
            System.out.println("лучи " + getLight().getType());

            System.out.printf("\nтеперь %s %s\n\n", obj.getName(), obj.getDye().getType());

    }

    public Light getLight() {
        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    @Override
    public String toString() {
        return "Star{" +
                "light=" + light +
                ", moves=" + moves +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Star star = (Star) o;
        return this.getName() == star.getName() &&
                light == star.getLight() &&
                this.getLocation() == star.getLocation() &&
                this.getDye() == star.getDye();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getName(), light, getLocation(), getDye());
    }
}
