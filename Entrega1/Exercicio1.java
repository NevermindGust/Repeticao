import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        int contador=0, idade=1, qtdIdade=0;
        double altura=0, peso, mediaAltura=0, percentualPeso, contPessoas=0, contPeso=0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        idade = leitor.nextInt();
        while (idade != 0) {
                
                if (idade > 50) {
                    qtdIdade++;
                }
                if (idade != 0) {
                    contPessoas++;
                }
                System.out.println("Digite a altura: ");
                altura = leitor.nextDouble();
                if (idade >= 10 && idade <= 20) {
                    contador++;                        
                    mediaAltura += altura;
                }
                System.out.println("Digite o peso: ");
                peso = leitor.nextDouble();
                if (peso < 40 && peso > 0) {
                    contPeso++;
                }
                System.out.println("\nDigite a idade: ");
                idade = leitor.nextInt();
            }
        percentualPeso = (contPeso/contPessoas)*100;
        mediaAltura = mediaAltura/contador;
    
        System.out.println("\nNumero de pessoas com mais de 50 anos: "+qtdIdade);
        System.out.println("Media altura de 10 a 20 anos: "+mediaAltura);
        System.out.println("Percentual de pessoas abaixo de 40kg: "+percentualPeso+"%");
        leitor.close();
    }
}