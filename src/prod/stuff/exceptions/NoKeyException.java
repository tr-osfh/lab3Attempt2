package prod.stuff.exceptions;

public class NoKeyException extends RuntimeException {
    public NoKeyException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Ключа нет";
    }
}
