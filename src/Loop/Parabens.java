package Loop;
import java.util.Scanner;
public class Parabens {
    public static void main(String[]args){
        Scanner notasInseridas = new Scanner(System.in);
        System.out.println("Insira a primeira nota: ");
        double nota1 = notasInseridas.nextDouble();
        System.out.println("Insira a segunda nota: ");
        double nota2 = notasInseridas.nextDouble();
        System.out.println("Insira a terceira nota: ");
        double nota3 = notasInseridas.nextDouble();
        System.out.println("Insira a quarta nota: ");
        double nota4 = notasInseridas.nextDouble();

        double mediaAluno = (nota1 + nota2 + nota3 + nota4) / 4;

        if(mediaAluno >= 6){
            System.out.println("Parabéns, você foi aprovado !");
        }else{
            System.out.println("Infelizmente você foi reprovado...");
        }

    }
}
