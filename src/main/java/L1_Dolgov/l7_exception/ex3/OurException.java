package L1_Dolgov.l7_exception.ex3;

/**
 * Created by Ксения on 14.03.2016.
 */
public class OurException extends Exception {

    private static final long serialVersionUID = -3905940065218658813L;

    public OurException() {
    }

    public OurException(String message) {
        super(message);
    }
}
