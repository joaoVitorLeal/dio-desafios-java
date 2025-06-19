package io.github.joaoVitorLeal.factories;

import io.github.joaoVitorLeal.domain.account.Account;
import io.github.joaoVitorLeal.domain.account.CheckingAccount;
import io.github.joaoVitorLeal.domain.account.SavingsAccount;
import io.github.joaoVitorLeal.domain.client.Client;

public class AccountFactory {

    public static Account createCheckingAccount(Client client) {
        return new CheckingAccount(client);
    }

    public static Account createSavingsAccount(Client client) {
        return new SavingsAccount(client);
    }
}
