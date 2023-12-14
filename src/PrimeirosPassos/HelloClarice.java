package PrimeirosPassos;

import java.util.Scanner;

public class HelloClarice {
    public static void main(String[]args){

        System.out.println("Insira o seu nome");
        Scanner nomeDigitado = new Scanner(System.in);

        String nomeUser = nomeDigitado.nextLine();

        System.out.println("Olá, " + nomeUser);

    }
}
