package io.github.joaoVitorLeal.domain.account;

import io.github.joaoVitorLeal.domain.client.Client;

public final class SavingsAccount extends AccountImpl {

    public SavingsAccount(Client client) {
        super(client);
    }

    @Override
    public void printStatement() {
        System.out.println("=== Savings Account Statement ===");
        super.printCommonInfo();
    }
}
