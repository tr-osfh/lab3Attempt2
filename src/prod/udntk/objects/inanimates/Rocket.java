package prod.udntk.objects.inanimates;

import prod.stuff.exceptions.RedundantPilot;
import prod.udntk.enums.Color;
import prod.udntk.enums.GroundLocation;
import prod.udntk.interfaces.Transport;
import prod.udntk.objects.persons.Person;

import java.util.Objects;

public final class Rocket extends MoonObject implements Transport {
    public Rocket(GroundLocation location, Color dye){
        super.setName("Ракета");
        this.setStarted(false);
        super.setLocation(location);
        super.setDye(dye);
    }

    private boolean started;
    private boolean opend;
    private String pilot;

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

    public void addPilot(Person person) throws RedundantPilot {
        if (this.getPilot().equals(person.getName())){
            throw new RedundantPilot("");
        } else{
            System.out.println(person.getName() + " становится пилотом " + this.getName());
            setPilot(person.getName());
        }
    }

    public void fly(){
        if (this.isStarted()) {
            System.out.println(this.getName() + " взлетает");
        } else {
            System.out.println(this.getName() + "не может взлететь");
        }
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rocket rocket = (Rocket) o;
        return this.getName() == rocket.getName()
                && this.getLocation() == rocket.getLocation()
                && this.getDye() == rocket.getDye()
                && this.getPilot() == rocket.getPilot()
                && started == rocket.started
                && opend == rocket.opend
                && Objects.equals(pilot, rocket.pilot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLocation(), getDye(), getPilot(), started, opend, pilot);
    }

    @Override
    public String toString() {
        return "Rocket{" +
                "started=" + started +
                ", opend=" + opend +
                ", pilot='" + pilot + '\'' +
                ", moves=" + moves +
                '}';
    }
}
