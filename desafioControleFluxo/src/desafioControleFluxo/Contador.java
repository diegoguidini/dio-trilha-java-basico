package desafioControleFluxo;
import java.util.Scanner;

public class Contador {
	
	public static void main(String[] args) {	
		
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		
		try {
			contar (parametroUm, parametroDois);
		}catch (Exception ParametrosInvalidosException) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
	}
			
		static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException  {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm >= parametroDois) {
			throw new ParametrosInvalidosException();
		}
			else {
			//realizar o for para imprimir os números com base na variável contagem
			for (int contagem = parametroDois - parametroUm ; parametroUm < parametroDois; parametroUm ++)
			System.out.println("Imprimindo número: " + parametroUm);
			}
				
		
	}

}