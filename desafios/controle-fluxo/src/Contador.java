import exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scInt = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int n1 = scInt.nextInt();

        System.out.print("Digite o segundo numero: ");
        int n2 = scInt.nextInt();

        try{
            contar(n1, n2);
        }
        catch(ParametrosInvalidosException exception){
            System.out.println(exception.getMessage());
        }
    }

    private static void contar(int n1, int n2) throws ParametrosInvalidosException{
        if(n2 > n1){
            throw new ParametrosInvalidosException("O segundo numero nao pode ser maior que o primeiro.");
        }

        else{
            int contagem = n1 - n2;

            for(int i = 1; i <= contagem; i++){
                System.out.println("Mostrando o numero: " + i);
            }
        }
    }
}
