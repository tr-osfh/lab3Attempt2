package prod.udntk.objects.persons;

import prod.stuff.Moves;
import prod.udntk.enums.*;
import prod.udntk.interfaces.Scientist;
import prod.udntk.objects.PhysicalObject;

public final class Znayka extends Person implements Scientist {

    public Znayka(Mood mood, byte intelligence){
        super.setName("Знайка");
        super.setProfession(Professions.SCIENTIST);
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

}