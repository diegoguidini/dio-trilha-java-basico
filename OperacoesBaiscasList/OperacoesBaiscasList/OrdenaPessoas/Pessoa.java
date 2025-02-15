package OrdenaPessoas;



public class Pessoa implements Comparable <Pessoa> {
	
	private String nome;
	private int idade;
	private double altura;
	
	public Pessoa(String nome, int idade, double altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public double getAltura() {
		return altura;
	}
	
	public int compareTo(Pessoa outraPessoa) {
		return Integer.compare(this.idade, outraPessoa.idade);
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
	}
	
	
	
}
