package prod.udntk.objects.inanimates;

import prod.stuff.exceptions.NoKeyException;
import prod.udntk.enums.GroundLocation;
import prod.udntk.objects.PhysicalObject;

public class Key extends PhysicalObject {

    public Key(boolean exists){
        this.setName("Ключ");
        this.setExists(exists);
    }

    private boolean exists;

    public void fall(){
        if (exists) {
        System.out.println("Ключ пропал");
        this.setExists(false);
        } else {
            throw new NoKeyException("ключа как нет так и не было");
        }
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
}
