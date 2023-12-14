package FormasGeometricas;
import java.util.Scanner;

public class Losango {
    public static void main(String[]args){
        Scanner valores = new Scanner(System.in);

        System.out.println("Insira a diagonal maior: ");
        int diagonalMaior = valores.nextInt();

        System.out.println("Insira a diagonal menor: ");
        int diagonalMenor = valores.nextInt();

        int resultado = diagonalMaior * diagonalMenor / 2;

        System.out.println("A área do losango = " + resultado);
    }
}
