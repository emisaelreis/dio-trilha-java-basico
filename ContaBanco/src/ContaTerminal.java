import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal
 {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia, cliente;
        Double saldo = 0.0;
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("\n\tConta Bancária");
        
        System.out.print("\nDigite o número da conta: ");
        numero = sc.nextInt();

        System.out.print("\nDigite o número da agência: ");
        agencia = sc.next();

        System.out.print("\nDigite o nome do cliente: ");
        cliente = sc.next();

        System.out.print("\nDigite o Saldo: ");
        saldo = sc.nextDouble();

        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque\n\n", cliente, agencia, numero, saldo);
        sc.close();



    }
}
