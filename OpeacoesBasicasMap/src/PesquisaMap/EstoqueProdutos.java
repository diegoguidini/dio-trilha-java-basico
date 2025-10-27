package PesquisaMap;

import java.util.HashMap;
import java.util.Map;


public class EstoqueProdutos {
	
	private Map<Long, Produto> estoqueProdutosMap;

	public EstoqueProdutos() {
		this.estoqueProdutosMap = new HashMap<>();
	}
	
	public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
		estoqueProdutosMap.put(cod, new Produto(nome,quantidade,preco));
	}
	
	public void exibirProdutos() {
		System.out.println(estoqueProdutosMap);
	}
	
	/*public void calcularValorTotalEstoque() {
		if (!estoqueProdutosMap.isEmpty()) {
			double total = estoqueProdutosMap.values().stream()
					.mapToDouble(produto -> produto.getPreco()*produto.getQuantidade())
					.sum();
			System.out.println("Valor total do estoque: R$" + total);
		}else {
			System.out.println("O estoque esta vazio");
		}
	}*/	
	public double calcularValorTotalEstoque2() {
		double total2=0d;
		if (!estoqueProdutosMap.isEmpty()) {
			for (Produto p : estoqueProdutosMap.values()){
			  total2 += p.getQuantidade() * p.getPreco();
			} 
		}
		return total2;
	}
	
	public Produto obterProdutoMaisBarato() {
			if (estoqueProdutosMap.isEmpty()) {
				System.out.println("O estoque esta vazio");
				return null;
			}
			Produto produtoMaisBarato = null;
				for (Produto p : estoqueProdutosMap.values()) {
					 if (produtoMaisBarato == null || p.getPreco() < produtoMaisBarato.getPreco()) {
						 produtoMaisBarato = p;					
				}
			}	
			return produtoMaisBarato;
		}
	
	public Produto obterProdutoMaisCaro() {
		if (estoqueProdutosMap.isEmpty()) {
			System.out.println("O estoque esta vazio");
			return null;
		}
		Produto produtoMaisCaro = null;
			for (Produto p : estoqueProdutosMap.values()) {
				 if (produtoMaisCaro == null || p.getPreco() > produtoMaisCaro.getPreco()) {
					 produtoMaisCaro = p;					
			}
		}	
		return produtoMaisCaro;
	}
	
	
	 
		public static void main(String[] args) {
			EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
		
		estoqueProdutos.adicionarProduto(1, "lapis", 4, 0.50);
		estoqueProdutos.adicionarProduto(2, "borracha", 2, 0.25);
		estoqueProdutos.adicionarProduto(3, "caneta", 3, 1.00);
	
		estoqueProdutos.calcularValorTotalEstoque2();
		estoqueProdutos.exibirProdutos();
		System.out.println("Valor total do estoque: R$" + estoqueProdutos.calcularValorTotalEstoque2());
	    System.out.println("O produto mais barato e de: R$" + estoqueProdutos.obterProdutoMaisBarato());
	    System.out.println("O produto mais caro e de: R$" + estoqueProdutos.obterProdutoMaisCaro());
	    
	}
	

}
