package Loop;
import java.util.Scanner;
public class EnquantoIsso {
    public static void main(String[]args){
         Scanner valorInformado = new Scanner(System.in);
         System.out.println("Insira o primeiro valor:");
         int valor1 = valorInformado.nextInt();

         System.out.println("Insira o segundo valor:");
         int valor2 = valorInformado.nextInt();

         while(valor2 <= 0){
             System.out.println("Insira novamente o segundo valor:");
             valor2 = valorInformado.nextInt();
         }

         double resultado = (double) valor1 / valor2;
         System.out.println("O resultado da divisão = " + resultado);

    }
}
