package model;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Conta implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Integer numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public Conta() { }

    public Conta(String agencia, String nomeCliente, Integer numero, double saldo) {
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
                nomeCliente, agencia, numero, saldo);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return Double.compare(saldo, conta.saldo) == 0 && Objects.equals(numero, conta.numero) && Objects.equals(agencia, conta.agencia) && Objects.equals(nomeCliente, conta.nomeCliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, agencia, nomeCliente, saldo);
    }
}
