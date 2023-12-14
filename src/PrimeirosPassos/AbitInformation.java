package PrimeirosPassos;

import java.util.Scanner;

public class AbitInformation {
    public static void main(String[]args){
        Scanner dados = new Scanner(System.in);
        System.out.println("Insira o seu nome:");
        String nomeUser = dados.nextLine();
        System.out.println("Insira a sua idade:");
        int idadeUser = dados.nextInt();

        System.out.println("Olá " + nomeUser + ", sua idade é: " + idadeUser);



    }
}
