package operadores;
import java.util.Date;

public class operadores {
	public static void main(String[] args) throws Exception {
				
/*TIPOS VARIÁVEIS*/
		
		String nome = "Diego";
		int idade = 32;
		char sexo = 'M';
		boolean doadorOrgao = false;
		double peso = 70.5;
		String dataNascimento = "16/01/1992";
		Date dtregistro = new Date();
		
		System.out.printf("O %S tem %d anos, pesa %s quilos e é do sexo %s e nasceu em %S. %nÉ doador de orgaos? %s %n"
				+ "Data execução %S"
				,nome, idade, peso,sexo,dataNascimento, doadorOrgao,dtregistro);
		
	}
}



