package exception;

public class GameException extends RuntimeException {

    public GameException() {
        super();
    }

    public GameException(String razon) {
        super(razon);
    }
}
