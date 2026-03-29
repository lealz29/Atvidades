import java.util.Scanner;

public class Periodos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Em qual período você estuda:");
        System.out.println("M - Matutino | V - Vespertino | N - Noturno");
        System.out.println("Digite a letra correspondente ao período que você estuda");

        String periodo = scanner.next();

        String saudacao = switch (periodo) {
            case "M" -> "Bom dia!";
            case "V" -> "Boa tarde!";
            case "N" -> "Boa noite!";
            default  -> "Valor inválido! Use apenas M, V ou N.";
                
        };

        System.out.println(saudacao);

        scanner.close();
    }
 
}
