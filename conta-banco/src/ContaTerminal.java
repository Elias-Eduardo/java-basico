import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Declaração das variáveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // Solicita ao usuário para digitar o número da conta
        try ( // Criação do Scanner para ler a entrada do usuário
                Scanner scanner = new Scanner(System.in)) {
            // Solicita ao usuário para digitar o número da conta
            System.out.print("Digite o número da conta: ");
            numero = scanner.nextInt();
            // Consome a nova linha pendente após a leitura do número
            scanner.nextLine();
            // Solicita ao usuário para digitar o número da agência
            System.out.print("Digite o número da agência: ");
            agencia = scanner.nextLine();
            // Solicita ao usuário para digitar o nome do cliente
            System.out.print("Digite o nome do cliente: ");
            nomeCliente = scanner.nextLine();
            // Solicita ao usuário para digitar o saldo da conta
            System.out.print("Digite o saldo: ");
            saldo = scanner.nextDouble();
            // Exibe a mensagem de conta criada
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
            // Fecha o scanner para liberar os recursos
        }
    }
}
