import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade, estadoCivil, qtdCasados=0, qtdSolteiros=0;
        double mediaViuvos=0, percentualDesqViuvo, contPessoas=0, contViuvo=0, idadeViuvo=0, contDesqViuvo=0;

        System.out.println("Digite a idade: ");
        idade = leitor.nextInt();

        while (idade != 0) {
            System.out.println("\nDigite o estado civil:\n1-Casado \n2-Solteiro \n3-Viuvo \n4-Desquitado");
            estadoCivil = leitor.nextInt();
            if (estadoCivil==1) {
                qtdCasados++;
                contPessoas++;
            }
            else if (estadoCivil==2) {
                qtdSolteiros++;
                contPessoas++;
            }
            else if (estadoCivil==3) {
                contPessoas++;
                contViuvo++;
                contDesqViuvo++;

                idadeViuvo = idadeViuvo + idade;
            }        
            else if (estadoCivil==4) {
                contPessoas++;
                contDesqViuvo++;
            }
            System.out.println("\nDigite a idade: ");        
            idade = leitor.nextInt();
        }
        percentualDesqViuvo = (contDesqViuvo/contPessoas)*100;
        mediaViuvos = idadeViuvo/contViuvo;

        System.out.println("Total de pessoas: "+contPessoas);
        System.out.println("\nQuantidade de pessoas casadas: "+qtdCasados);
        System.out.println("Quantidade de pessoas solteiras: "+qtdSolteiros);
        System.out.println("Media das idade das pessoas viuvas: "+mediaViuvos+" anos");
        System.out.println("Percentual de viuvos e desquitados: "+percentualDesqViuvo+"%");


        leitor.close();
    }
}
