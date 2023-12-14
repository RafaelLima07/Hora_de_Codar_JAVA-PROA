package Loop;

public class Alturas {
    public static void main(String[] args) {
        //Indica uma saida por meio do sistema operacional 'System.out', escrita em tela por 'printf':
        float AnacletoAlt  = 1.50F;
        float FelisbertoAlt = 1.10F;
        int Ano = 0;

        while(FelisbertoAlt < AnacletoAlt){
            FelisbertoAlt = FelisbertoAlt + 0.03F;
            AnacletoAlt = AnacletoAlt + 0.02F;
            Ano ++;
        }
        System.out.println("Vão se passar: " + Ano + " anos");
    }
}
