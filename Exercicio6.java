import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua altura (ex: 1.75): ");
        Double altura = entrada.nextDouble();

        System.out.println("Digite o sexo ( m para masculino, f para feminino): ");
        String sexo = entrada.next();

        double pesoIdeal = 0;

        if (sexo.equals("m")) {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo.equals("f")) {
            pesoIdeal = (62.1 * altura) - 44.7;
        }
        else {
            System.out.println("Sexo inválido. Por favor, digite m para masculino ou f para feminino.");
            entrada.close();
            return;
        }

        System.out.println("Seu peso ideal é: " + pesoIdeal);

        entrada.close();
    }

}
