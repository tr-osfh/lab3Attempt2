package prod.stuff.exceptions;

public class WrongMovement extends RuntimeException {
    public WrongMovement(String message) {
        super(message);
    }

    @Override
    public String getMessage(){
        return "Этот объект не может перемещяться по земле";
    }

}
