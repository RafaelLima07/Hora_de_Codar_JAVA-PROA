package FormasGeometricas;
import java.util.Scanner;

public class Circulo {
    public static void main(String[]args){
        Scanner valores = new Scanner(System.in);

        System.out.println("Insira o raio do circulo: ");
        int raio = valores.nextInt();

        double resultado = Math.PI * raio * raio;
        System.out.println("A area do circulo = " + resultado);
    }
}
