package org.pedro;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Vidal");

        banco.listarContas();

        Cliente clienteUm = new Cliente("Pedro", "11111111111");
        Cliente clienteDois = new Cliente("Luc", "22222222222");

        Conta contaUm = new ContaCorrente(clienteUm);
        Conta contaDois = new ContaPoupanca(clienteDois);

        banco.adicionarConta(contaUm);
        banco.adicionarConta(contaDois);

        contaUm.depositar(200);
        contaUm.transferir(100, contaDois);

        contaDois.sacar(50);

        banco.listarContas();
    }
}