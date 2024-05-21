import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) throws ParametrosInvalidosException {
    Scanner terminal = new Scanner(System.in);
    System.out.println("Digite o primeiro parâmetro");
    int parametroUm = terminal.nextInt();
    System.out.println("Digite o segundo parâmetro");
    int parametroDois = terminal.nextInt();

    try {
      //chamando o método contendo a lógica de contagem
      Contador.contar(parametroUm, parametroDois);

    } catch (ParametrosInvalidosException exception) {
      throw new RuntimeException(exception);
    }

  }
}