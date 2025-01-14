package prod.udntk.objects.persons;

import prod.stuff.Moves;
import prod.udntk.enums.*;
import prod.udntk.interfaces.Scientist;
import prod.udntk.objects.PhysicalObject;

import java.util.Objects;

public final class Znayka extends Person implements Scientist {

    public Znayka(Mood mood, byte intelligence){
        super.setName("Знайка");
        super.setProfession(Profession.SCIENTIST);
        super.setDna(314);

        super.setMood(mood);
        super.setIntelligence(intelligence);

        super.moves.add(new Moves(getName(), "Пытается успокоить незнайку"));
        super.moves.add(new Moves(getName(), "Громко говорит о лунных пейзажах"));
        super.moves.add(new Moves(getName(), "Остается жить на луне."));
    }

    @Override
    public void explore(){
        System.out.println(this.getName() + " смотрит с интересом");
    }

    public void explore(PhysicalObject obj){
        System.out.println(this.getName() + " изучает " + obj.getName());
    }


    @Override
    public int hashCode() {
        return Objects.hash(getName(),
                getLocation(),
                getDna(),
                getIntelligence(),
                getMood(),
                getProfession());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return this.getDna() == person.getDna()
                && this.getIntelligence() == person.getIntelligence()
                && this.getProfession() == person.getProfession()
                && this.getLocation() == person.getLocation()
                && this.getMood() == person.getMood();
    }

    @Override
    public String toString() {
        return "Person{" +
                "moves=" + moves +
                ", mood=" + this.getMood() +
                ", intelligence=" + this.getIntelligence() +
                ", location=" + this.getLocation() +
                ", profession=" + this.getProfession() +
                ", dna=" + this.getDna() +
                '}';
    }

}