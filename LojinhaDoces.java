import java.util.Scanner;

public class LojinhaDoces {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int doce = leitor.nextInt();
    int quantidadeDoces = doce * 2;

    System.out.println("O cliente obteve " + quantidadeDoces + " doces");
  }
}
