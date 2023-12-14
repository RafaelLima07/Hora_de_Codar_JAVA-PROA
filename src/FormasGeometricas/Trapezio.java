package FormasGeometricas;
import java.util.Scanner;

public class Trapezio {
    public static void main(String[]args){
        Scanner valores = new Scanner(System.in);

        System.out.println("Insira a base maior: ");
        int baseMaior = valores.nextInt();

        System.out.println("Insira a base menor: ");
        int baseMenor = valores.nextInt();

        System.out.println("Insira a altura: ");
        int altura = valores.nextInt();

        int resultado = ((baseMaior + baseMenor) * altura) / 2;
        System.out.println("A área do trapézio = " + resultado);
    }
}
