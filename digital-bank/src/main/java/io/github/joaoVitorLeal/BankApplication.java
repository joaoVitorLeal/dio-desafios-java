package io.github.joaoVitorLeal;

import io.github.joaoVitorLeal.domain.account.Account;
import io.github.joaoVitorLeal.domain.account.CheckingAccount;
import io.github.joaoVitorLeal.domain.account.SavingsAccount;
import io.github.joaoVitorLeal.domain.client.Client;

import java.math.BigDecimal;

public class BankApplication {
    public static void main(String[] args) {

        Client joao = new Client("João", "111.000.000-11");

        Account checkingAccount = new CheckingAccount(joao);
        Account savingsAccount = new SavingsAccount(joao);

        checkingAccount.deposit(BigDecimal.valueOf(100));
        checkingAccount.transfer(BigDecimal.valueOf(50), savingsAccount);

        checkingAccount.printStatement();
        savingsAccount.printStatement();
    }
}