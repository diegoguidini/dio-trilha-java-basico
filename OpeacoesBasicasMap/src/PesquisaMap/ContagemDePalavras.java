package PesquisaMap;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

import javax.swing.text.html.parser.Entity;

import OperacoesMap.Dicionario;

public class ContagemDePalavras {
	
	private Map<String, Integer> contagem;

	public ContagemDePalavras() {
		this.contagem = new HashMap<>();
	} 
	
	
	// Método para adicionar uma palavra ao texto
	public void adicionarPalavra(String palavra) {
		if (palavra == null || palavra.isEmpty()) return;//retorna vazio
		palavra = palavra.toLowerCase().replaceAll("[^a-zà-ú0-9]","");//limpa caractere
		contagem.put(palavra, contagem.getOrDefault(palavra, 0)+1);
	}
	
	// Método para adicionar várias palavras de um texto completo
	public void adicionarTexto(String texto) {
		if (texto == null || texto.isBlank()) return;
		String[] palavras = texto.split("\\s+");
		for (String p : palavras) {
			adicionarPalavra(p);
		}
	}
	
	public void exibirTexto() {
		System.out.println(contagem);
	}
	
	public void removerPalavra(String palavra) {
		if (!contagem.isEmpty())
			contagem.remove(palavra);
		
	}
	
	//Exibir todas as palavras com suas quantidades
	public void exibirContagemPalavras() {
		if (contagem.isEmpty()){
			System.out.println("Nenuma palavra adicionada");
			return;
		}
		System.out.println("Contagem de palavras");
		for (java.util.Map.Entry<String, Integer>entry : contagem.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
	}
}
	
	public void ecnontrarPalavraMaisFrequente(String texto) {
		String palavraMaisFrequente = null;
		int maiorContagem = 0;
		
		for (Map.Entry<String, Integer> entry : contagem.entrySet()) {
			if (entry.getValue()> maiorContagem) {
				palavraMaisFrequente = entry.getKey();
				maiorContagem = entry.getValue();
			}
		}
		System.out.println(palavraMaisFrequente + "=" + maiorContagem);
		
	}
	
	

	public static void main(String[] args) {
		ContagemDePalavras contagemdepalavras = new ContagemDePalavras();
		
		
		
		contagemdepalavras.adicionarTexto("eu estou fazendo um teste teste");
		//contagemdepalavras.adicionarPalavra("teste");
		contagemdepalavras.exibirTexto();
		//contagemdepalavras.exibirContagemPalavras();
		//contagemdepalavras.removerPalavra("teste");
		//contagemdepalavras.exibirContagemPalavras();
		contagemdepalavras.ecnontrarPalavraMaisFrequente(null);
	}
}
