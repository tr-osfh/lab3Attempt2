package prod.udntk.objects.persons;

import prod.stuff.Moves;
import prod.udntk.enums.Mood;
import prod.udntk.enums.Professions;
import prod.udntk.interfaces.Scientist;
import prod.udntk.objects.PhysicalObject;

public final class Doctor extends Person implements Scientist {

    public Doctor(Mood mood, byte intelligence){
        super.setName("Доктор Пилюлькин");
        super.setProfession(Professions.LOUNGER);
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
}
