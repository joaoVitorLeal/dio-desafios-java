package io.github.joaoVitorLeal.domain.account;

import java.math.BigDecimal;

public interface Account {

    void withdraw(BigDecimal amount);

    void deposit(BigDecimal amount);

    void transfer(BigDecimal amount, Account account);

    void printStatement();
}
