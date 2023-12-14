package Condicionamento;
import java.util.Scanner;

public class MaioNumero2 {
    public static void main(String[]args){
        Scanner numero = new Scanner(System.in);
        System.out.println("Escolha o primeiro número:");
        int numero1 = numero.nextInt();

        System.out.println("Escolha o segundo número:");
        int numero2 = numero.nextInt();

        System.out.println("Escolha o terceiro número:");
        int numero3 = numero.nextInt();

        System.out.println("Escolha o quarto número:");
        int numero4 = numero.nextInt();

        if(numero1 > numero2 && numero1 > numero3 && numero1 > numero4){
            System.out.println("O maior número é: " + numero1);
        }else if(numero2 > numero1 && numero2 > numero3 && numero2 > numero4) {
            System.out.println("O maior número é: " + numero2);
        }else if(numero3 > numero1 && numero3 > numero2 && numero3 > numero4){
            System.out.println("O maior número é: " + numero3);
        }else{
            System.out.println("O maior número é: " + numero4);
        }
    }
}
