package contaBanco;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    
	System.out.println("Entre com o número da conta");
	int contaCorrente = sc.nextInt();
	
	System.out.println("Entre com o número da Agencia");
	String agencia = sc.next();
	
	System.out.println("Digite seu nome");
	String nomeCliente = sc.next();
	String sobreNomeCliente = sc.next();
    
	System.out.println("Digite seu saldo");
	float saldo = sc.nextFloat();
	
	System.out.println("Olá " + nomeCliente + " " + sobreNomeCliente + ", Obrigado por criar uma conta em nosso banco, sua agência é " 
	+ agencia + " conta " + contaCorrente + " e seu saldo R$" + saldo + " já está disponível para saque.");
	
	}
}