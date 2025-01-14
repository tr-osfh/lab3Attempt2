package prod.udntk.objects.inanimates;

import prod.udntk.enums.Color;
import prod.udntk.enums.GroundLocation;

import java.util.Objects;

public final class Rock extends MoonObject {
    public Rock(String name, GroundLocation location, Color dye) {
        super.setName(name);
        super.setLocation(location);
        super.setDye(dye);
    }

    public void shine() {
        System.out.println(this.getName() + " блестит " + this.getDye().getType());
    }

    @Override
    public String toString() {
        return "Rock{" +
                "name=" + getName() +
                "location=" + getLocation() +
                "dye=" + getDye() +
                "moves=" + getAllMoves() +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLocation(), getDye(), getAllMoves());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rock rock = (Rock) o;
        return this.getName().equals(rock.getName())
                && this.getDye() == rock.getDye()
                && this.getLocation() == rock.getLocation()
                && this.getAllMoves().equals(rock.getAllMoves());
    }
}