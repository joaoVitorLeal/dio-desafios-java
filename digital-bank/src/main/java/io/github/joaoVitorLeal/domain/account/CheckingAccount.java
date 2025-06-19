package io.github.joaoVitorLeal.domain.account;

import io.github.joaoVitorLeal.domain.client.Client;

public final class CheckingAccount extends AccountImpl {

    public  CheckingAccount(Client client) {
        super(client);
    }

    @Override
    public void printStatement() {
        System.out.println("=== Checking Account Statement ===");
        super.printCommonInfo();
    }
}
