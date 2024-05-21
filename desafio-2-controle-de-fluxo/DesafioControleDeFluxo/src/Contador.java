public class Contador {
  static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
    if (parametroDois <= parametroUm) {
      throw new ParametrosInvalidosException("Parametros passados são inválidos, verifique se o primeiro" +
          " parametro não é maior que o segundo.");
    }

    int contagem = parametroDois - parametroUm;
    //realizar o for para imprimir os números com base na variável contagem
    for (int i = 0; i <= contagem; i++) {
      System.out.println("Contagem " + (i + 1));
    }
  }
}
