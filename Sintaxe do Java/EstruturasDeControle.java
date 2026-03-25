public class EstruturasDeControle {
  public static void main(String[] args) {
    int n1 = 2;

    // Condicionais
    if (n1 < 5) {
      System.out.println("abaixo");
    } else {
      System.out.println("acima");
    }

    // Laços de Repetição
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }
    while (n1 < 10) {
      System.out.println(n1);
      n1 += 1;
    }

  }
}
