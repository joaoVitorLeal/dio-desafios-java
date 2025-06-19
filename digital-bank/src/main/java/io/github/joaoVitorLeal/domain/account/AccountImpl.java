package io.github.joaoVitorLeal.domain.account;

import io.github.joaoVitorLeal.domain.client.Client;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

public abstract sealed class AccountImpl implements Account, Serializable
        permits CheckingAccount, SavingsAccount {

    @Serial
    private static final long serialVersionUID = 1L;

    private static final int DEFAULT_BRANCH = 1;
    private static int SEQUENTIAL = 1;

    private UUID id;
    protected Integer branch;
    protected Integer accountNumber;
    protected BigDecimal balance;
    protected Client client;

    public AccountImpl() { }

    public AccountImpl(Client client) {
        this.id = UUID.randomUUID();
        this.branch = DEFAULT_BRANCH;
        this.accountNumber = SEQUENTIAL++;
        this.client = client;
    }

    @Override
    public void withdraw(BigDecimal amount) {
        this.balance = this.balance.subtract(amount);
    }

    @Override
    public void deposit(BigDecimal amount) {
        this.balance = this.balance.add(amount);
    }

    @Override
    public void transfer(BigDecimal amount, Account targetAccount) {
        this.withdraw(amount);
        targetAccount.deposit(amount);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AccountImpl account = (AccountImpl) o;
        return Objects.equals(branch, account.branch) && Objects.equals(accountNumber, account.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branch, accountNumber);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Integer getBranch() {
        return branch;
    }

    public void setBranch(Integer branch) {
        this.branch = branch;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    protected void printCommonInfo() {
        System.out.println("Client: " + client.getName());
        System.out.println("Branch: " + branch);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
