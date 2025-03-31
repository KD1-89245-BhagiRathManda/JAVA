package assignment06.a;

public class NegativeDiameterException extends Exception {
    public NegativeDiameterException() {

    }
    public String getMessage() {
        return "Negative Diameter is not allowed";
    }

}
