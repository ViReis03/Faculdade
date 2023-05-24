import javax.swing.*;

public class appSwing {
  public static void main(String entrada[]) {
    int n1, n2;
    int mod, div;
    double raiz, pot;
    String msg = "";

    n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite N1: "));
    n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite N2: "));

    mod = n1 % n2;
    div = (int) n1 / (int) n2;
    raiz = Math.sqrt(n1);
    pot = Math.pow(n1, n2);

    msg = msg + "n1 = " + n1 + "   n2 = " + n2 + "\n";
    msg = msg + "resto da divisao de n1 por n2 = " + mod + "\n";
    msg = msg + "quociente da divisao de n1 por n2 = " + div + "\n";
    msg = msg + "raiz quadrada de n1 = " + raiz + "\n";
    msg = msg + "potencia de nl e n2 = " + pot + "\n";
    
    JOptionPane.showMessageDialog(null, msg);
    System.exit(0);

  }
}
