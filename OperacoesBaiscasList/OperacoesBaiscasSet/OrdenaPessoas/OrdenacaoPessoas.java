package OrdenaPessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoas {

	private List<Pessoa> ordenaPessoaList;

	public OrdenacaoPessoas() {
		this.ordenaPessoaList = new ArrayList<>();
	}

	
	public void adicionarPessoa(String nome, int idade, double altura) {
		ordenaPessoaList.add(new Pessoa(nome, idade, altura));
		{
			System.out.printf("Pessoa Adicionada: " + nome + ", Idade: " + idade + ", Altura: " + altura + "%n");
		}
		
	}
	
	public List<Pessoa> ordenarPorIdade() {
				List<Pessoa> pessoasPorIdade = new ArrayList<>(ordenaPessoaList);
				Collections.sort(pessoasPorIdade);
				return pessoasPorIdade;
			}
			
	public List<Pessoa> ordenarPorAltura() {
		List<Pessoa> pessoasPorAltura = new ArrayList<>(ordenaPessoaList);
		Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
		return pessoasPorAltura;
	}


	public static void main(String[] args) {
		OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

		ordenacaoPessoas.adicionarPessoa("Claudio", 25, 1.59);
		ordenacaoPessoas.adicionarPessoa("Diego", 33, 1.69);
		ordenacaoPessoas.adicionarPessoa("Matheus", 19, 1.79);
		System.out.println(ordenacaoPessoas.ordenarPorIdade());
		System.out.println(ordenacaoPessoas.ordenarPorAltura());

	}

	class ComparatorPorAltura implements Comparator<Pessoa> {
		public int compare (Pessoa p1, Pessoa p2) {
			return Double.compare(p1.getAltura(), p2.getAltura());
		}
	}
	
	
}
