package prod.stuff.exceptions;

public class SameObjException extends RuntimeException{
    public SameObjException(String message){
        super(message);
    }

    @Override
    public String getMessage(){
        return "нельзя освещять космические объедки";
    }

}
