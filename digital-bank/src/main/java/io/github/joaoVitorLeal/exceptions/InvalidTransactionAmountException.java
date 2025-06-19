package io.github.joaoVitorLeal.exceptions;

public class InvalidTransactionAmountException extends RuntimeException {
    public InvalidTransactionAmountException() {
        super("Transaction amount must be greater than zero (0).");
    }
}
