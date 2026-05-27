import java.util.Scanner;

public class Operacoes {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = entrada.nextDouble();

        System.out.println("Escolha uma opção:");
        System.out.println("M - Média entre os números");
        System.out.println("S - Diferença do maior pelo menor");
        System.out.println("P - Produto entre os números");
        System.out.println("D - Divisão do primeiro pelo segundo");
        
        // .next() lê a string e .toUpperCase() evita o erro de letra minúscula - *Importnte
        String opcao = entrada.next().toUpperCase();

        switch (opcao) {
            case "M":
                double media = (n1 + n2) / 2;
                System.out.println("Média: " + media);
                break;

            case "S":
               
                if (n1 > n2) {
                    System.out.println("Diferença: " + (n1 - n2));
                } else {
                    System.out.println("Diferença: " + (n2 - n1));
                }
                break;

            case "P":
                System.out.println("Produto: " + (n1 * n2));
                break;

            case "D":
                
                if (n2 != 0) {
                    System.out.println("Divisão: " + (n1 / n2));
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }

        entrada.close();
    }
}
