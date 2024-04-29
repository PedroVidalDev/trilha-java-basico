import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scString = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        Scanner scFloat = new Scanner(System.in);

        int numero;
        String agencia, nome;
        float saldo;

        try{
            System.out.print("Digite o numero da conta: ");
            numero = scInt.nextInt();

            System.out.print("Digite o numero da agencia: ");
            agencia = scString.nextLine();

            System.out.print("Digite o nome do titular da conta: ");
            nome = scString.nextLine();

            System.out.print("Digite o saldo: ");
            saldo = scString.nextFloat();

            System.out.println("Ola " + nome + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + " conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque!");

        }

        catch (InputMismatchException error){
            System.out.println("Dado inserido de forma incorreta. Por favor não inserir textos em campos numéricos e vice-versa.");
        }

        scString.close();
        scInt.close();
        scFloat.close();
    }
}