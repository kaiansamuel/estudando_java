import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite sua idade ");
        int idade = scanner.nextInt();
        System.out.println("Digite o valor que pretende investir: ");
        double investimento = scanner.nextDouble();

        System.out.println(String.format("O sr %s que tem a %d anos vai investir %.2f esse mês", nome, idade, investimento));

        scanner.close();
    }
}
