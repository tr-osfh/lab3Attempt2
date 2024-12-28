package prod.udntk.objects.inanimates;

import prod.stuff.Moves;
import prod.udntk.enums.Color;
import prod.udntk.enums.SpaceLocation;

public final class Sky extends SpaceObject{

    public Sky(Color dye){
        super.setName("Небо");
        super.setLocation(SpaceLocation.CLOSESPACE);
        super.setDye(dye);
        super.moves.add(new Moves("Описание неба", "Над головой небо"));
    }

    public void changeColor(Color dye){
        this.setDye(dye);
        System.out.println(this.getName() + " меняет цвет на " + dye);
    }

    @Override
    public void describe(){
        System.out.printf("Облака медленно плывут по %s небу. \n", this.getDye().getType());
    }
}
