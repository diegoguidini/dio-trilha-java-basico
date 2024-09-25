package operadores;
import java.util.Date;

public class operadores {
	public static void main(String[] args) throws Exception {
				
//Operadores-Atrubuição
		
		String nome = "Diego Guidini";
		int idade = 32;
		char sexo = 'M';
		boolean doadorOrgao = false;
		double peso = 70.5;
		String dataNascimento = "16/01/1992";
		Date dtregistro = new Date();
		
		System.out.printf("O %S tem %d anos, pesa %s quilos e é do sexo %s e nasceu em %S. %nÉ doador de orgaos? %s %n"
				+ "Data execução %S",nome, idade, peso,sexo,dataNascimento, doadorOrgao,dtregistro);
		

//Aritiméticos
		
		double soma = 10.5 + 7;
		int subtração = 113 - 25;
		int multiplicação = 20 * 7;
		int divisao = 15 / 3;
		int modulo = 18 % 3;
		double resultado = (10 * 7) + (20/4);

		
//operador unário
		
		// (+) Operador unário de valor positivo - Número são positivos sem esse operador explicitamente;
		// (-) Operador unário de valor negativo - Nega um número ou expressão aritmética
		// (++) Operador unário de incremento de valor - incrementa valor 1 unidade
		// (--) Operador unário de decremento de valor - decrementa o valor em 1 unidade
		// (!) Operador unário lógico de negação - nega o valor de uma expressão booleana.
		

//operador ternário
		
	int a, b;
	a = 5;
	b = 6;
	String resultado1 = "";
	
	if (a==b)
    	resultado1 = "verdadeiro";
    else
    	resultado1 = "falso";
		
    //Ternario: String resultado1 = a==b ?"verdadeiro" : "falso";
	

//Relacionais
	
	
		
	}
}



