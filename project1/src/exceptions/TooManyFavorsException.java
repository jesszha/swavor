package exceptions;

public class TooManyFavorsException extends Exception {
    public TooManyFavorsException() {
        super();
    }

    public TooManyFavorsException(String msg) {
        super(msg);
    }
}
