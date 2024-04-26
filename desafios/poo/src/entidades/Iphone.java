package entidades;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {
    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar pagina...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica...");
    }
}
