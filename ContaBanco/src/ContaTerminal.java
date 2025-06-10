import model.Conta;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)) {
            Conta conta0 = new Conta();

            System.out.println("Por favor, digite o número da agência!");
            conta0.setAgencia(sc.nextLine());
            System.out.println("Por favor, digite o número da conta!");
            conta0.setNumero(Integer.valueOf(sc.nextLine()));
            System.out.println("Por favor, digite o seu nome");
            conta0.setNomeCliente(sc.nextLine());
            System.out.println("Por favor, Informe o seu saldo!");
            conta0.setSaldo(Double.parseDouble(sc.nextLine()));

            System.out.println(conta0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
