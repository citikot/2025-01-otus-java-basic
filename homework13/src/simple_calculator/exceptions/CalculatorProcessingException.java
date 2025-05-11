package simple_calculator.exceptions;

public class CalculatorProcessingException extends RuntimeException {
    public CalculatorProcessingException(String message) {
        super(message);
    }
}
