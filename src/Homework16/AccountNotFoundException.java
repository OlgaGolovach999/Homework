package Homework16;

public class AccountNotFoundException extends RuntimeException {
    private String errorCode;

    public AccountNotFoundException(String message, String errorCode) {
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
        return "AccountNotFoundException{errorCode='" + errorCode + "', message='" + getMessage() + "'}";
    }
}