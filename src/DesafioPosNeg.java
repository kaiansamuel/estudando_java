import java.util.Scanner;

public class DesafioPosNeg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("Numero positivo");
        } else {
            System.out.println("Numero negativo");
        }
    }
}
