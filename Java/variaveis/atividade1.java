package variaveis;
import javax.swing.*;

public class atividade1 {
  public static void main(String entrada[]) {
    int n1, n2;
    double div, pot;
    String msg = "";

    n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite N1: "));
    n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite N2: "));

    div = n1 / n2;
    pot = Math.pow(n1, n2);

    msg = msg + "n1 = " + n1 + "   n2 = " + n2 + "\n";
    msg = msg + "quociente da divisao de N1 por N2 = " + div + "\n";
    msg = msg + "potencia de N1 e N2 = " + pot + "\n";

    JOptionPane.showMessageDialog(null, msg);
    System.exit(0);
  }
}