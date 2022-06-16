import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int contSoma=0, contMult=0, qtdNum, operacao;
        double num=0, soma=0, mult=1, i=0;

        System.out.println("Escolha o que deseja fazer:\n1-Soma \n2-Multiplicacao \n3-Sair");
        operacao = leitor.nextInt();
            
        do{
            switch (operacao) {
                case 1:
                    System.out.println("Quantos numeros deseja somar?: ");
                    qtdNum = leitor.nextInt();
                    System.out.println("Digite os numeros que quer somar: ");
                    while (i < qtdNum) {
                        num = leitor.nextDouble();
                        soma = num + soma;
                        i++;
                    }
                    System.out.println("Soma: "+soma);
                    contSoma++;
                    i=0; soma=0;
                    break;
                case 2:
                    System.out.println("Quantos numeros deseja multiplicar?: ");
                    qtdNum = leitor.nextInt();
                    System.out.println("Digite os numeros que quer multiplicar: ");
                    while (i < qtdNum) {
                        num = leitor.nextDouble();
                        mult = num * mult;
                        i++;
                    }
                    System.out.println("Multiplicacao: "+mult);
                    contMult++;
                    i=0; mult=0;
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Valor invalido");
                    break;
            }
            System.out.println("\nEscolha o que deseja fazer:\n1-Soma \n2-Multiplicacao \n3-Sair");
            operacao = leitor.nextInt();
        } while (operacao!=3);
        
        System.out.println("\nSoma realizada "+contSoma+" vezes");
        System.out.println("Multiplicacao realizada "+contMult+" vezes");

        leitor.close();
    }
}
/*Escreva um programa que exiba o seguinte menu para o usuário.
1. Somar vários números
2. Multiplicar vários números
3. Sair
Quando o usuário escolhe a primeira opção, o programa pergunta a ele quantos
números deseja somar. A seguir, obtém cada um desses números, faz a soma deles e
exibe o resultado.
Quando o usuário escolhe a segunda opção, o programa pergunta a ele quantos
números ele deseja multiplicar. A seguir, obtém cada um desses números, faz o
produtório deles e exibe o resultado.
Quando o usuário escolher a terceira opção, o programa encerra a execução.
Note que o menu é exibido repetidas vezes, até o momento em que o usuário decidir
sair.
Ao final, mostre quantas vezes o usuário realizou a operação de soma e quantas vezes
ele realizou a operação de multiplicação. */