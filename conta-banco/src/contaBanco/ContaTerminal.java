package contaBanco;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
public static void ain(String[] args) {

	Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    
	System.out.println("Entre com o número da conta");
	int contaCorrente = sc.nextInt();
	
	System.out.println("Entre com o número da Agencia");
	String agencia = sc.next();
	
	System.out.println("Digite seu nome");
	String nomeCliente = sc.next();

	float saldo = (float) 237.48;
	
	System.out.println("Olá " + nomeCliente + "Obrigado por criar uma conta em nosso banco, sua agência é " 
	+ agencia + contaCorrente + " e seu saldo " + saldo + " já está disponível para saque.");
	
	}
}