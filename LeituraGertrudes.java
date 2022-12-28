import java.util.Scanner;

public class LeituraGertrudes {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int paginas = leitor.nextInt();
    int paginasLidas = 3;

    int numeroDias = paginas / paginasLidas;

    System.out.println(numeroDias + " dias");
  }
}
