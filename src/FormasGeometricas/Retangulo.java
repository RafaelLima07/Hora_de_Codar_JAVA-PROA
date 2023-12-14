package FormasGeometricas;
import java.util.Scanner;

public class Retangulo {
    public static void main(String[]args){
        Scanner valores = new Scanner(System.in);

        System.out.println("Digite a base:");
        int base = valores.nextInt();

        System.out.println("Digite a altura:");
        int altura = valores.nextInt();

        int resultado = base * altura;

        System.out.println("Área do retângulo = " + resultado);
    }
}
