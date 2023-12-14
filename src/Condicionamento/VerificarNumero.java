package Condicionamento;

import java.util.Scanner;

public class VerificarNumero {
    public static void main(String[]args){
        Scanner number = new Scanner(System.in);

        System.out.println("Me diga um número");
        int numeroEscolhido = number.nextInt();

        if(numeroEscolhido > 0){
            System.out.println("O valor escolhido é positivo");
        }else if(numeroEscolhido < 0){
            System.out.println("O valor escolhido é negativo");
        }else{
            System.out.println("O valor escolhido é neutro");
        }

    }
}
