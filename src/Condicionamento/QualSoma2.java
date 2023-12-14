package Condicionamento;

import java.util.Arrays;
import java.util.Scanner;

public class QualSoma2 {
    public static void main(String[]args){
        Scanner numero = new Scanner(System.in);
        int[] numerosEscolhidos = new int[6];
        int numeracao = 1;

        while(numeracao <= 5){
            System.out.println("Digite o " + numeracao + "° número: ");
            int valorInserido = numero.nextInt();
            numerosEscolhidos[numeracao -1] = valorInserido;
            numeracao++;
        }

        Arrays.sort(numerosEscolhidos);
        int resultado = numerosEscolhidos[4] + numerosEscolhidos[5];
        System.out.println("A soma dos dois maiores números é: " + resultado);
    }
}
