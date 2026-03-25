import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = entrada.nextInt();

        System.out.println("Digite o segundo número: ");
        int n2 = entrada.nextInt();

        System.out.println("Os númeors em ordem decrescente são: ");
        if (n1 > n2) {
            System.out.println(n1 + " e " + n2);
        } else {
            System.out.println(n2 + " e " + n1);
        }

        entrada.close();
    
    }

}
