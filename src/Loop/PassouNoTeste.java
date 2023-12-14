package Loop;
import java.util.Scanner;

public class PassouNoTeste {
    public static  void main(String[]args){
        Scanner valores = new Scanner(System.in);
        int qntdAlunos = 0;

        while(true){
            System.out.println("Informe o nome do aluno:");
            String nomeAluno = valores.nextLine();
            System.out.println("Informe a primeira nota:");
            double nota1 = valores.nextDouble();
            System.out.println("Informe a segunda nota:");
            double nota2 = valores.nextDouble();
            System.out.println("Informe a terceira nota:");
            double nota3 = valores.nextDouble();
            System.out.println("Informe a quarta nota:");
            double nota4 = valores.nextDouble();
            System.out.println("Informe a quinta nota:");
            double nota5 = valores.nextDouble();
            System.out.println("Informe a sexta nota:");
            double nota6 = valores.nextDouble();

            double mediaFinal = (nota1 + nota2 + nota3 + nota4 + nota5 + nota6) / 6;

            if(mediaFinal >= 6.5){
                System.out.println("Aluno: " +nomeAluno + " aprovado!");
                qntdAlunos++;

            }else{
                System.out.println("Aluno: " + nomeAluno + " reprovado!");
            }

            System.out.println("Deseja informar outro aluno, S/N?");
            String respostaUser = valores.nextLine();

            if(respostaUser.equals("N")){
                System.out.println("Programa finalizado...");
                break;
            }
        }

        System.out.println("Quantidade de alunos cadastrados: " + qntdAlunos);
    }
}
