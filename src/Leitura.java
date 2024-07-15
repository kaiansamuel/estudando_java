import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();
        System.out.println("Digite o ano do filme ");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Digite sua avaliação do filme ");
        double avaliacao = leitura.nextDouble();

        System.out.println("Filme: " + filme);
        System.out.println("Ano de Lançamento " + anoDeLancamento);
        System.out.println("Sua avaliação " +avaliacao);
    }
}
