package academia;
import java.util.Scanner;

public class CadastroAluno {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("INFORME NOME");
		String nomeAluno = sc.next();
		
		System.out.println("INFORME SOBRENOME");
		String sobreNomeAluno = sc.next();
		
		System.out.println("INFORME O CPF");
		String CPF = sc.next();
		
		System.out.println("Aluno " + nomeAluno + sobreNomeAluno + " do CPF " + CPF + " cadastrado com sucesso!");
		
		
		/**public void verificaCadastroCliente() {
		System.out.println("CLIENTE CADASTRADO");
	}
	public void cadastrarCliente() {
		System.out.println("CLIENTE CADASTRADO");
	}**/

}
}

