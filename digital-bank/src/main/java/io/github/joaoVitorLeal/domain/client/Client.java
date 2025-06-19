package io.github.joaoVitorLeal.domain.client;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public final class Client implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private UUID id;
    private String name;
    private String cpf;

    public Client() { }

    public Client(String name, String cpf) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.cpf = cpf;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cpf);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(cpf, client.cpf);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
