import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

    String nomeCliente;
    int numeroAgencia;
    int numeroConta;
    int digitoConta;
    float saldo;
    

    public static void main(String[] args) throws Exception {
        ///Numero Conta
        //Numero Agencia
        //Nome Cliente
        //Saldo
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        ContaTerminal conta = new ContaTerminal();
        System.out.println("");
        System.out.print("Por favor, digite o seu nome completo: ");
        conta.nomeCliente = scan.nextLine();
        System.out.print("Por favor, digite o número da agência: ");
        conta.numeroAgencia = scan.nextInt();
        System.out.print("Por favor, digite o número da conta sem o dígito: ");
        conta.numeroConta = scan.nextInt();
        System.out.print("Agora, digite o dígito da conta: ");
        conta.digitoConta = scan.nextInt();
        System.out.print("Por favor, digite o quanto será depositado (Centavos separados por pontos, Ex.: 200.80): ");
        conta.saldo = scan.nextFloat();
        scan.close();
        String saldo = String.format("%.2f", conta.saldo);

        System.out.println(" ");
        System.out.println("Olá " + conta.nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "
        + conta.numeroAgencia + ", conta "+ conta.numeroConta + "-" + conta.digitoConta + " e seu saldo R$" + 
        saldo + " já está disponível para saque.");
    }
}
