import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = entrada.nextInt();

        if (n1 == n2) {
            System.out.println("Números iguais");
        } 
        
        else {
            int resultado;
            if (n1 > n2) {
                resultado = n1 - n2;
            } else {
                resultado = n2 - n1;
            }
            System.out.println("A diferença do maior pelo menor é: " + resultado);
        }

        entrada.close();
    }
}

    


    
    