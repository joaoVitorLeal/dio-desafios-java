package io.github.joaoVitorLeal;

import io.github.joaoVitorLeal.domain.account.Account;
import io.github.joaoVitorLeal.domain.client.Client;
import io.github.joaoVitorLeal.services.account.AccountService;
import io.github.joaoVitorLeal.services.account.impl.AccountServiceImpl;

import java.math.BigDecimal;

public class BankApplication {

    private static final AccountService service = new AccountServiceImpl();

    public static void main(String[] args) {

        Client joao = new Client("João", "111.000.000-11");
        Client nery = new Client("Nery", "222.000.000-22");

        // Criando Contas (corrente e poupança)
        Account checkingAccount = service.createCheckingAccount(joao);
        Account savingsAccount = service.createSavingsAccount(nery);

        // Realizando operações bancárias
        service.deposit(checkingAccount, BigDecimal.valueOf(100));
        service.transfer(checkingAccount, savingsAccount, BigDecimal.valueOf(45));

        // Exibindo extratos
        checkingAccount.printStatement();
        savingsAccount.printStatement();
    }
}