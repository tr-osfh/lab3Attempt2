package prod.udntk.objects.persons;

import prod.stuff.Moves;
import prod.udntk.enums.Mood;
import prod.udntk.enums.Profession;

public final class Neznayka extends Person{

    public Neznayka(Mood mood, byte intelligence){
        super.setName("Незнайка");
        super.setProfession(Profession.LOUNGER);
        super.setDna(220);

        super.setMood(mood);
        super.setIntelligence(intelligence);

        super.moves.add(new Moves(getName(), "Кидает лунные камни в пропасть."));
        super.moves.add(new Moves(getName(), "Доказывает, что высадка на луну - заговор."));
        super.moves.add(new Moves(getName(), "Теперь живет в пещере."));
        super.moves.add(new Moves(getName(), "Остается жить на луне."));
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
