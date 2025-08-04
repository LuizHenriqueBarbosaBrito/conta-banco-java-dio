import java.util.Scanner;

public class ontaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número da conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o número da agência:");
        String agencia = scanner.nextLine();
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Digite o saldo:");
        double saldo = scanner.nextDouble();
        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é \n"  + agencia + ", conta " + numero + ", e seu saldo: " + saldo + " já está disponivel para saque.");
    }
}