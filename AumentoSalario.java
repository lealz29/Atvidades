import java.util.Scanner;

public class AumentoSalario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o plano de trabalho: a, b ou c");
        String plano = entrada.next().toUpperCase();

        System.out.print("Digite o salário atual: ");
        double salarioAtual = entrada.nextDouble();

        double novoSalario;


        switch (plano) {
            case "A":
                novoSalario = salarioAtual * 1.10; 
                break;
            case "B":
                novoSalario = salarioAtual * 1.15; 
                break;
            case "C":
                novoSalario = salarioAtual * 1.20; 
                break;
            default:
                System.out.println("Plano inválido!");
                entrada.close();
                return;
        }

        System.out.printf("O novo salário é: R$ %.2f%n", novoSalario);

        entrada.close();
    }

}

