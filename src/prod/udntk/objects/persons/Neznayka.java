package prod.udntk.objects.persons;

import prod.stuff.Moves;
import prod.udntk.enums.Mood;
import prod.udntk.enums.Professions;
import prod.udntk.interfaces.Lounger;

public final class Neznayka extends Person implements Lounger {

    public Neznayka(Mood mood, byte intelligence){
        super.setName("Незнайка");
        super.setProfession(Professions.LOUNGER);
        super.setDna(220);

        super.setMood(mood);
        super.setIntelligence(intelligence);

        super.moves.add(new Moves(getName(), "Кидает лунные камни в пропасть."));
        super.moves.add(new Moves(getName(), "Доказывает, что высадка на луну - заговор."));
        super.moves.add(new Moves(getName(), "Теперь живет в пещере."));
        super.moves.add(new Moves(getName(), "Остается жить на луне."));
    }


    @Override
    public void doNothing(){
        System.out.println(this.getName() + " бедокурит");
    }
}
