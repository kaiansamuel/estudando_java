public class Ternario {
    public static void main(String[] args) {

        double nota1 = 8;
        double nota2 = 2.3;
        double nota3 = 4.3;
        double nota4 = 5.5;
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        String resultado;
        resultado = media >= 7.0 ? "Esta aprovado!" : "Esta reprovado!";

        System.out.println(resultado);
    }
}
