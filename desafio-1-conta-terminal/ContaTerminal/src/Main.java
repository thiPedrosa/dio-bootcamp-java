import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe o limite diário de saque:");
    double dailyLimit = scanner.nextDouble();
    double remainingLimit = dailyLimit;

    while (true) {
      System.out.println("Informe o valor do saque:");
      double withdrawal = scanner.nextDouble();

      if (withdrawal == 0) {
        break;
      }

      if (withdrawal > remainingLimit) {
        System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
        break;
      } else {
        remainingLimit -= withdrawal;
        System.out.println("Saque realizado. Limite restante: " + remainingLimit);
      }
    }

    System.out.println("Transacoes encerradas.");
  }
}