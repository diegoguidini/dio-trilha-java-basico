package main.java.set.Ordenacao;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	
	private Set<Produto> produtoSet;
	
	public CadastroProdutos() {
		// TODO Auto-generated constructor stub
	this.produtoSet = new HashSet<>();
	}
	
	public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		produtoSet.add(new Produto(nome, cod, preco, quantidade));
	}
	
	  public Set<Produto> exibirProdutosPorNome() {
		    Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
		    if (!produtoSet.isEmpty()) {
		      return produtosPorNome;
		    } else {
		      throw new RuntimeException("O conjunto está vazio!");
		    }
		  }
	
	  public Set<Produto> exibirProdutosPorPreco() {
		    Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
		    if (!produtoSet.isEmpty()) {
		      produtosPorPreco.addAll(produtoSet);
		      return produtosPorPreco;
		    } else {
		      throw new RuntimeException("O conjunto está vazio!");
		    }
		  }
	
	
	public static void main(String[] args) {
	    // Criando uma instância da classe CadastroProdutos
		CadastroProdutos cadastroProdutos = new CadastroProdutos();

	    // Adicionando e exibindo produto
	    cadastroProdutos.adicionarProduto(1, "caneta", 1.50, 1);
	    cadastroProdutos.adicionarProduto(2, "lapis", 1.00, 2);
	    cadastroProdutos.adicionarProduto(3, "borracha", 0.50, 3);
	    cadastroProdutos.adicionarProduto(4, "borracha2", 0.30, 1);
	    
	    System.out.println(cadastroProdutos.produtoSet);
	    System.out.println(cadastroProdutos.exibirProdutosPorNome());
	    System.out.println(cadastroProdutos.exibirProdutosPorPreco());
	 
	    
	}
}
