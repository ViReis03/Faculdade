package variaveis;
public class operadores {
  public static void main(String entrada[]) {
    int n1, n2;
    int mod, div;
    double raiz, pot;
    String msg = "";

    n1 = Integer.parseInt(entrada[0]);
    n2 = Integer.parseInt(entrada[1]);

    mod = n1 % n2;
    div = (int) n1 / (int) n2;
    raiz = Math.sqrt(n1);
    pot = Math.pow(n1, n2);

    msg = "n1 = " + n1 + "   n2 = " + n2 + "\n";
    msg = "resto da divisao de n1 por n2 = " + mod + "\n";
    msg = "quociente da divisao de n1 por n2 = " + div + "\n";
    msg = "raiz quadrada de n1 = " + raiz + "\n";
    msg = "potencia de nl e n2 = " + pot + "\n";
    System.out.println(msg);
    System.exit(0);

  }
}
