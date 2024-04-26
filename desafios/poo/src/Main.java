import entidades.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("Funcoes musicais: ");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

        System.out.println("Funcoes telefonicas: ");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("Funcoes Navegador: ");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}