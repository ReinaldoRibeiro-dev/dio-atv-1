import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String nome, agencia;
        double saldo;

        System.out.print("Ola, por favor, digite seu nome: ");
        Scanner nomeScanner = new Scanner(System.in);
        nome = nomeScanner.nextLine();

        System.out.print("Agora digite sua agência: ");
        Scanner agenciaScanner = new Scanner(System.in);
        agencia = agenciaScanner.nextLine();

        System.out.print("Agora digite o número da sua conta: ");
        Scanner numeroScanner = new Scanner(System.in);
        numero = numeroScanner.nextInt();

        System.out.print("Agora digite seu Saldo em conta: ");
        Scanner saldoScanner = new Scanner(System.in);
        saldo = saldoScanner.nextDouble();

        System.out.print("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque." );

    }
}
