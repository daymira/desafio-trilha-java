
import java.util.Scanner;

public class ContaTerminal{
    
    public static void main(String[] args)  {
       Scanner scan = new Scanner(System.in);
       Dados user = new Dados();

       System.out.println("Ola, bem-vindo(a) ao nosso banco");

       System.out.println("Digite seu nome: ");
       String nome = scan.nextLine();
       user.setNomeCliente(nome);

       System.out.println("Digite sua agencia: ");
       String agencia = scan.next();
       user.setAgencia(agencia);

       System.out.println("Digite o numero da conta: ");
       int numero = scan.nextInt();
       user.setNumeroConta(numero);

       System.out.println("Digite o valor de deposito: ");
       float saldo = scan.nextFloat();
       user.setSaldo(saldo);
       scan.close();

       String message = String.format("Ola %s, obrigado por criar uma conta em nosso banco! Sua agencia e "+
       "%s conta numero %d e saldo de %.2f.", nome, agencia, numero, saldo);

       System.out.println(message);

    }
}
