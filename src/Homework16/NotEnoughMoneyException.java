package Homework16;

public class NotEnoughMoneyException extends RuntimeException {
    private String errorCode;

    public NotEnoughMoneyException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public String toString() {
        return "NotEnoughMoneyException{errorCode='" + errorCode + "', message='" + getMessage() + "'}";
    }
}