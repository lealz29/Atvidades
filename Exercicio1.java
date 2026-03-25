import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double num = entrada.nextDouble();

        if (num > 20) {
            double resultado = num / 2;
            System.out.println("A metade de " + num + " é: " + resultado);
        }
        entrada.close();
    }
}