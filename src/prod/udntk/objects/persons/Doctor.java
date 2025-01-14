package prod.udntk.objects.persons;

import prod.stuff.Moves;
import prod.udntk.enums.Mood;
import prod.udntk.enums.Profession;
import prod.udntk.interfaces.Scientist;
import prod.udntk.objects.PhysicalObject;

import java.util.Objects;

public final class Doctor extends Person implements Scientist {

    public Doctor(Mood mood, byte intelligence){
        super.setName("Доктор Пилюлькин");
        super.setProfession(Profession.LOUNGER);
        super.setDna(1109);

        super.setMood(mood);
        super.setIntelligence(intelligence);

        super.addMove(new Moves("Осматривается", "Смотрит по строрнам."));
    }

    @Override
    public void explore(){
        System.out.println(this.getName() + " оценивающе окидывает окружение взглядом");
    }

    public void explore(PhysicalObject obj){
        System.out.println(this.getName() + "осматривает" + obj.getName());
    }


    @Override
    public int hashCode() {
        return Objects.hash(getName(),
                getLocation(),
                getDna(),
                getIntelligence(),
                getMood(),
                getProfession(),
                getAllMoves());
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
                && this.getMood() == person.getMood()
                && this.getAllMoves().equals(person.getAllMoves());
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name =" + this.getName() +
                ", moves" + this.getAllMoves() +
                ", mood=" + this.getMood() +
                ", intelligence=" + this.getIntelligence() +
                ", location=" + this.getLocation() +
                ", profession=" + this.getProfession() +
                ", dna=" + this.getDna() +
                '}';
    }
}
