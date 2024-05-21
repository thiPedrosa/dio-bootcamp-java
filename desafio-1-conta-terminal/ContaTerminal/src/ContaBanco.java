import java.util.Scanner;

public class ContaBanco {
    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, seja bem vindo(a) ao banco Dio");
        System.out.println("Para criar sua conta digite o numero da conta que deseja criar usa conta:");
        Integer conta = scanner.nextInt();
        scanner.nextLine(); // consome o restante da linha
        System.out.println("Ótimo, agora digite o número da agencia que deseja criar:");
        Integer agencia = scanner.nextInt();
        scanner.nextLine(); // consome o restante da linha
        System.out.println("Perfeito, qual o seu nome completo:");
        String nomeCompleto = scanner.nextLine();
        System.out.println("Agora digite o valor que deseja depositar em sua conta:");
        double saldo = scanner.nextDouble();
        scanner.nextLine(); // consome o restante da linha
        System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
