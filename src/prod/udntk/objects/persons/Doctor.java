package prod.udntk.objects.persons;

import prod.stuff.Moves;
import prod.udntk.enums.Mood;
import prod.udntk.enums.Profession;
import prod.udntk.interfaces.Scientist;
import prod.udntk.objects.PhysicalObject;

public final class Doctor extends Person implements Scientist {

    public Doctor(Mood mood, byte intelligence){
        super.setName("Доктор Пилюлькин");
        super.setProfession(Profession.LOUNGER);
        super.setDna(1109);

        super.setMood(mood);
        super.setIntelligence(intelligence);

        super.moves.add(new Moves("Осматривается", "Смотрит по строрнам."));
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
        int hs = 0;
        char[] name = getName().toCharArray();
        for (char i : name){
            hs += i - '0' * (int) getIntelligence();
        }
        return hs;
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
