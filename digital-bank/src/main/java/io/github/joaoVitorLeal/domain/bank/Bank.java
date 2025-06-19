package io.github.joaoVitorLeal.domain.bank;

import io.github.joaoVitorLeal.domain.account.Account;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Bank implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private UUID id;
    private String name;
    private List<Account> accounts;

    public Bank() {
    }

    public Bank(String name, List<Account> accounts) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.accounts = accounts;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Objects.equals(id, bank.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
