import javax.swing.*;

public class repeticao {
  public static void main(String entrada[]) {

    int Tabuada;
    char op = 0;
    String msg = "",
        msgEntr = "Digite 1 repeticao for\nDigite 2 para repeticao while\nDigite 3 para repeticao do/while";

    Tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
    op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);

    switch (op) {
      case '1': {
        msg += "Tabuada do " + Tabuada + " pelo for: \n\n";
        for (int i = 1; i <= 10; i = i + 1) {
          msg += Tabuada + " x " + i + " = " + Tabuada * i + "\n";
        }
        break;
      }
      case '2': {
        msg = msg + "Tabuada do " + Tabuada + " pelo While: \n\n";
        int i = 1;
        while (i <= 10) {
          msg += Tabuada + " x " + i + " = " + Tabuada * i + "\n";
          i += 1;
        }
        break;
      }
      case '3': {
        msg += "Tabuada do " + Tabuada + " pelo doWhile: \n\n";
        int i = 1;

        do {
          msg += Tabuada + " x " + i + " = " + Tabuada * i + "\n";
          i += 1;
        } while (i <= 10);
        break;
      }
      default:
        JOptionPane.showMessageDialog(null, "Opcao invalida, calculos nao realizados");
    }

    if (op >= '1' && op <= '3') {

      JOptionPane.showMessageDialog(null, msg);

    }
    System.exit(0);
  }
}