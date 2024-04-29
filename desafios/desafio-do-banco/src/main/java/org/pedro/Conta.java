package org.pedro;

import lombok.Getter;

@Getter
public abstract class Conta implements IConta {

    protected Cliente cliente;
    protected int agencia;
    protected int numero;
    protected double saldo;

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    public Conta(Cliente cliente){
        this.cliente = cliente;
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("Extrato da Conta");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Agencia: " + getAgencia());
        System.out.println("Numero: " + getNumero());
        System.out.println("Saldo: " + getSaldo());
    }
}
