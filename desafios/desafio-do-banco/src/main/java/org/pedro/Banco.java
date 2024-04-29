package org.pedro;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas = new ArrayList<>();

    public Banco(String nome){
        this.nome = nome;
    }

    public void adicionarConta(Conta conta){
        contas.add(conta);
    }

    public void listarContas(){
        if(!contas.isEmpty()){
            System.out.println("Lista das contas do banco: ");
            for (Conta conta : contas){
                System.out.println("Numero: " + conta.getNumero());
                System.out.println("Nome do cliente: " + conta.cliente.getNome());
                System.out.println("Saldo: R$" + conta.getSaldo());
                System.out.println("=-=-=-=-=-=-=-=");
            }
        } else{
            System.out.println("Sem nenhuma conta no sistema.");
        }
    }
}
