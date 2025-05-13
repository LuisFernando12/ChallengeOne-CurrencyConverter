package br.com.luis.fernando.exceptions;

public class CurrencyException extends RuntimeException {
    private String message;
    public CurrencyException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
