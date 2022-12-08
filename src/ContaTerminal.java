import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Integer numero;
        String agencia;
        String nomeCliente;
        Double saldo;

        System.out.println("Por favor, digite o número da Agência: ");
        agencia = sc.next();

        System.out.println("Por favor, digite o número da sua Conta: ");
        numero = sc.nextInt();

        System.out.println("Por favor, digite seu Nome completo: ");
        nomeCliente = sc.next();

        sc.nextLine();

        System.out.println("Digite o valor que irá depositar: ");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        sc.close();
    }
}
