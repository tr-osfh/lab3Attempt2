package prod.udntk.objects.persons;

import prod.stuff.exceptions.NoKeyException;
import prod.udntk.enums.*;
import prod.udntk.objects.PhysicalObject;
import prod.udntk.objects.inanimates.Key;
import prod.udntk.objects.inanimates.Rocket;

public class Person extends PhysicalObject {

    public Person(){
        this.dna = 0;
        this.profession = Profession.NONE;
        this.location = GroundLocation.CAVE;
        this.intelligence = 0;
        this.mood = Mood.NONE;
    }

    private int dna;
    private Profession profession;
    private GroundLocation location;
    private byte intelligence;
    private Mood mood;

    public void talk(String phrase){
        System.out.println(this.getName() + " говорит " + phrase);
    }

    public void talk(String phrase, Person person){
        System.out.println(this.getName() + " говорит " + person.getName() + " : " + phrase);
    }

    public void openRocket(Key key, Rocket rocket) throws NoKeyException{
        System.out.println(getName() + " пытается открыть ракету ключем");
        if (key.isExists()){
            rocket.setOpend(true);
            System.out.println(rocket.getName() + " открыта");
        } else {
            throw new NoKeyException("Ключа нет");
        }
    }


    public void move(GroundLocation location) {
        System.out.println(this.getName() + " из " + this.getLocation().getType() + " идет в " + location.getType());
        this.setLocation(location);
    }

    @Override
    public void describe(){
        System.out.println(this.getProfession() + " " + this.getName() + " - стоит и задумчиво смотрит вдаль");
    }

    public int getDna() {
        return dna;
    }

    public void setDna(int dna) {
        this.dna = dna;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public GroundLocation getLocation() {
        return location;
    }

    public void setLocation(GroundLocation location) {
        this.location = location;
    }

    public byte getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(byte intelligence) {
        this.intelligence = intelligence;
    }

    public Mood getMood() {
        return mood;
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + super.getName() +
                "dna=" + dna +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Person person = (Person) object;
        return dna == person.dna;
    }

    @Override
    public int hashCode() {
        return dna;
    }
}
