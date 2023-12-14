package Loop;
import java.util.Scanner;
public class Quantos {
    public static void main(String[]args){
        Scanner valores = new Scanner(System.in);
        System.out.println("Informe o primeiro número:");
        int valor1 = valores.nextInt();
        System.out.println("Informe o segundo número:");
        int valor2 = valores.nextInt();

        int qntdNumeros = 0;
        int soma = 0;

        while(valor1 <= valor2){
            soma = soma + valor1;
            valor1++;
            qntdNumeros++;
        }

        double resultado = (double) soma / qntdNumeros;
        System.out.println("A média é = " + resultado);
    }
}
