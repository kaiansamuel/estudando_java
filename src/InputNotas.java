import javax.swing.*;

public class InputNotas {
    public static void main(String[] args) {

        String nota1 = JOptionPane.showInputDialog("Informe a primeira nota: ");
        String nota2 = JOptionPane.showInputDialog("Informe a segunda nota: ");
        String nota3 = JOptionPane.showInputDialog("Informe a terceira nota: ");
        String nota4 = JOptionPane.showInputDialog("Informe a quarta nota: ");

        double dNota1 = Double.parseDouble(nota1);
        double dNota2 = Double.parseDouble(nota2);
        double dNota3 = Double.parseDouble(nota3);
        double dNota4 = Double.parseDouble(nota4);

        double media = (dNota1 + dNota2 + dNota3 + dNota4) / 4;

        if (media <= 5) {
            JOptionPane.showMessageDialog(null, "Aluno reprovado com media " + media);
        } else if (media > 5 && media <= 7) {
            JOptionPane.showMessageDialog(null, "Aluno em recuperação com a media " + media);
        } else {
            JOptionPane.showMessageDialog(null, "Aluno aprovado com media " + media);
        }
    }
}
