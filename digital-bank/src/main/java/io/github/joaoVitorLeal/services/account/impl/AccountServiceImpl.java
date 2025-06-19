package io.github.joaoVitorLeal.services.account.impl;

import io.github.joaoVitorLeal.domain.account.Account;
import io.github.joaoVitorLeal.domain.client.Client;
import io.github.joaoVitorLeal.exceptions.InvalidTransactionAmountException;
import io.github.joaoVitorLeal.factories.AccountFactory;
import io.github.joaoVitorLeal.services.account.AccountService;

import java.math.BigDecimal;

public class AccountServiceImpl implements AccountService {

    @Override
    public void withdraw(Account account, BigDecimal amount) {
        validateAmount(amount);
        account.withdraw(amount);
    }

    @Override
    public void deposit(Account account, BigDecimal amount) {
        validateAmount(amount);
        account.deposit(amount);
    }

    @Override
    public void transfer(Account from, Account to, BigDecimal amount) {
        validateAmount(amount);
        from.transfer(amount, to);
    }

    public Account createCheckingAccount(Client client) {
        return AccountFactory.createCheckingAccount(client);
    }

    public Account createSavingsAccount(Client client) {
        return AccountFactory.createSavingsAccount(client);
    }

    private void validateAmount(BigDecimal amount) {
        if (amount == null || amount.compareTo(BigDecimal.ONE) < 0) {
            throw new InvalidTransactionAmountException();
        }
    }
}
