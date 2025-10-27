package OperacoesMap;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
	
	private Map<String, String> definicoesPalavras;
	
	
	public Dicionario() {
		this.definicoesPalavras = new HashMap<>();
	}
	
	public void adicionarPalavra(String palavra, String definicao) {
		definicoesPalavras.put(palavra, definicao);
	}
	
	public void removerPalavra(String palavra) {
		if (!definicoesPalavras.isEmpty()) {
			definicoesPalavras.remove(palavra);
		}
	}
	
	public void exibirPalavras() {
		System.out.println(definicoesPalavras);
	}
	
	public String pesquisarPorPalavra(String palavra) {
		String pesquisarPorPalavra = null;
		if (!definicoesPalavras.isEmpty()) {
			pesquisarPorPalavra = definicoesPalavras.get(palavra);
		}
		return pesquisarPorPalavra;
	}
	
	public static void main(String[] args) {
		Dicionario dicionario = new Dicionario();
		
		dicionario.adicionarPalavra("alto", "Pessoa ou construcao com tamanho a cima da media");
		dicionario.adicionarPalavra("baixo", "Pessoa ou construcao com tamanho a abaixo da media");
		dicionario.exibirPalavras();
		dicionario.removerPalavra("baixo");
		dicionario.exibirPalavras();
		
		System.out.println(dicionario.pesquisarPorPalavra("alto"));
		

 }
	
}
		
		
	