package prod.udntk.objects.inanimates;

import prod.stuff.exceptions.RedundantPilot;
import prod.stuff.exceptions.WrongMovement;
import prod.udntk.enums.Color;
import prod.udntk.enums.GroundLocation;
import prod.udntk.interfaces.Transport;
import prod.udntk.objects.persons.Person;

public final class Rocket extends MoonObject implements Transport {
    private boolean started;
    private boolean opend;
    private String pilot;

    public Rocket(GroundLocation location, Color dye){
        super.setName("Ракета");
        this.setStarted(false);
        super.setLocation(location);
        super.setDye(dye);

    }

    public void addPilot(Person person) throws RedundantPilot {
        System.out.println(person.getName() + " становится пилотом " + this.getName());
        setPilot(person.getName());
    }

    public void fly(){
        if (this.isStarted()) {
            System.out.println(this.getName() + " взлетает");
        } else {
            System.out.println(this.getName() + "не может взлететь");
        }
    }

    @Override
    public void startEngine(){
        System.out.println(this.getPilot() + " заводит двигатель");
        this.setStarted(true);
    }

    @Override
    public void stopEngine(){
        System.out.println(this.getPilot() + " глушит двигатель");
        setStarted(false);
    }

    @Override
    public void describe(){
        System.out.println("Сверкающая рактеа с эиблемой Рос. космос");
    }

    public String getPilot() {
        return pilot;
    }

    public void setPilot(String pilot) {
        this.pilot = pilot;
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    public boolean isOpend() {
        return opend;
    }

    public void setOpend(boolean opend) {
        this.opend = opend;
    }
}
