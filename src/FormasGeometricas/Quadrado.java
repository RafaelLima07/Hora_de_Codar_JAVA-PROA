package FormasGeometricas;
import java.util.Scanner;
public class Quadrado {
    public static void main(String[]args){
        Scanner valores = new Scanner(System.in);

        System.out.println("Insira o valor do lado do quadrado:");
        int lado = valores.nextInt();

        int resultado = lado * lado;

        System.out.println("A área do quadrado = " + resultado);
    }
}
