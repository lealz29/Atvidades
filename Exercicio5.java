import java.util.Scanner;
public class Exercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = entrada.nextInt();
        
        if (num >= 50 && num <= 100) {
            System.out.println("O número está dentro do intervalo de 50 a 100.");
        } else {
            System.out.println("O número não está dentro do intervalo de 50 a 100.");
        }
    

        entrada.close();
    }

}
