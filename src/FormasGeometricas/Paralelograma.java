package FormasGeometricas;
import java.util.Scanner;
public class Paralelograma {
    public static void main(String[]args){
        Scanner valores = new Scanner(System.in);

        System.out.println("Insira a base: ");
        int base = valores.nextInt();

        System.out.println("Insira a altura: ");
        int altura = valores.nextInt();

        int resultado = base * altura;
        System.out.println("A área do paralelograma = " + resultado);
    }
}
