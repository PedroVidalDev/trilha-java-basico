import entidades.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("\nFuncoes musicais: ");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

        System.out.println("\nFuncoes telefonicas: ");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("\nFuncoes Navegador: ");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}