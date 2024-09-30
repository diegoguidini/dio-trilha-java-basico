package estrutura_condicionais;

import java.util.Scanner;

public class CondicionalSimples {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		float saldo = 10;
		System.out.println("Entre com o saldo");
		float saque = sc.nextFloat();
		
		
		    if (saque < saldo) {
		    	saldo = (saldo - saque);
				System.out.println("saque permitido. " + "Seu saldo atual é de R$" + saldo);		
		    }
		      	else
		      	System.out.println("saque não permitido");
		    						
		}
		
}
