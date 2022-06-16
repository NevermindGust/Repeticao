import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numCarteira, qtdMulta=0, motorista=0, i;
        double valorMulta=0, totalArrecadado=0, divida=0;

        System.out.println("Digite o numero da carteira: ");
        numCarteira = leitor.nextInt();

        while (numCarteira != 0) {
                System.out.println("Digite a quantidade de multas do motorista: ");
                qtdMulta = leitor.nextInt();
                if (qtdMulta > motorista) {
                    motorista = numCarteira;
                }

                for (i=0; i<qtdMulta; i++){
                    System.out.println("Digite o valor da multa " +i+ ": " );
                    valorMulta = leitor.nextDouble();
                    totalArrecadado = totalArrecadado + valorMulta;
                    divida = divida + valorMulta;
                }

                if (i==1) {
                    divida = totalArrecadado;
                    System.out.println("Divida do motorista: "+ divida);
                    divida = 0;
                }
                else {
                    System.out.println("Divida do motorista: "+divida);
                    divida = 0;
                }

                System.out.println("\nDigite o numero da carteira: ");
                numCarteira = leitor.nextInt();
        }
        System.out.println("Total arrecadado: "+ totalArrecadado);
        System.out.println("Motorista com a carteira "+motorista+" possui mais multas");
        leitor.close();
    }
}
