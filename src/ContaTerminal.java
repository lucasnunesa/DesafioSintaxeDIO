import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta: ");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite o saldo para saque: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + ", e seu saldo " + saldo +
                            " já está disponível para saque.");

    }
}
