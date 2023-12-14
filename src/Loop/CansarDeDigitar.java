package Loop;
import java.util.Scanner;
public class CansarDeDigitar {
    public static void main(String[]args){
        Scanner valores = new Scanner(System.in);
        int contagem = 1;
        int [] numerosEscolhidos = new int[10];
        int resultado = 0;

        for(int i = 10; i > 0; i--){
            System.out.println("Insira o " + contagem + "° número:");
            numerosEscolhidos [i - 1] = valores.nextInt();
            contagem++;
        }
        for(int numero: numerosEscolhidos){
            System.out.println("Números informados: " + numero);
            resultado += numero;
        }

        int media = resultado / 10;
        System.out.println("Média aritmética = " + media);

    }
}
