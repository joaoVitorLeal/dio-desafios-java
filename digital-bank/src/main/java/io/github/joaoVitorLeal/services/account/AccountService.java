package io.github.joaoVitorLeal.services.account;

import io.github.joaoVitorLeal.domain.account.Account;
import io.github.joaoVitorLeal.domain.client.Client;

import java.math.BigDecimal;

public interface AccountService {

    void withdraw(Account account, BigDecimal amount);

    void deposit(Account account, BigDecimal amount);

    void transfer(Account from, Account to, BigDecimal amount);

    Account createCheckingAccount(Client client);

    Account createSavingsAccount(Client client);
}
