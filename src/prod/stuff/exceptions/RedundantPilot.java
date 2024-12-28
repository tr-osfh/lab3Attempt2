package prod.stuff.exceptions;

public class RedundantPilot extends Exception{
    public RedundantPilot(String message){
        super(message);
    }

    @Override
    public String getMessage() {
        return "Этот человек уже пилот";
    }
}
