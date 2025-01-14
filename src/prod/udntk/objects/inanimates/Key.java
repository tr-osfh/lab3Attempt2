package prod.udntk.objects.inanimates;

import prod.stuff.Moves;
import prod.stuff.exceptions.NoKeyException;
import prod.udntk.enums.GroundLocation;
import prod.udntk.objects.PhysicalObject;

import java.util.Objects;

public class Key extends PhysicalObject {

    private boolean exists;

    public Key(String name, boolean exists){
        this.setName(name);
        this.setExists(exists);
    }

    @Override
    public void describe(){
        System.out.println("Ключ с эмблеммой рос. космоса");
    }

    public void fall(GroundLocation location) throws NoKeyException{
        if (exists) {
            System.out.printf(this.getName() + "Провалился в %s\n", location.getType());
            this.setExists(false);
        } else {
            throw new NoKeyException("Ключ уже потерян");
        }
    }

    public boolean isExists() {
        return exists;
    }

    public void setExists(boolean exists) {
        this.exists = exists;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key = (Key) o;
        return exists == key.exists
                && getName().equals(key.getName())
                && this.getAllMoves().equals(key.getAllMoves());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(),
                exists,
                getAllMoves());
    }

    @Override
    public String toString() {
        return "Key{" +
                "name=" + getName() +
                "exists=" + exists +
                ", moves=" + moves +
                '}';
    }
}
