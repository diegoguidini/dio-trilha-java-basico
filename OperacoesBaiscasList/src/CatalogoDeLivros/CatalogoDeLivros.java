package CatalogoDeLivros;

import java.util.ArrayList;
import java.util.List;
public class CatalogoDeLivros {

	private List<Livro> livroList;

	public CatalogoDeLivros() {
		this.livroList = new ArrayList<>();
	}

	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		Livro livro = new Livro(titulo, autor, anoPublicacao);
		this.livroList.add(livro);
	}

	public void exibirLivros() {
		System.out.println(livroList);

	}

	public List<Livro> buscaPeloAutor(String autor) {
		List<Livro> livrosPorAutor = new ArrayList<>();
			if (!livroList.isEmpty()) {
				for (Livro livro : livroList) {
					if (livro.getAutor().equalsIgnoreCase(autor)) {
						livrosPorAutor.add(livro);

					}
				}
			}
			return livrosPorAutor;
		}
		
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
			if (!livroList.isEmpty()) {
				for (Livro l : livroList) {
					if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
						livrosPorIntervaloAnos.add(l);
					}
				}
			}
		return livrosPorIntervaloAnos;
	}
	
	public Livro pesquisarPortitulo(String titulo) {
		Livro livroPorTitulo = null;
		if (!livroList.isEmpty()) {
			for (Livro livro : livroList) {
				if (livro.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = livro;
					break;
				}
			}
		}
		return livroPorTitulo;
	}

	public static void main(String[] args) {
		CatalogoDeLivros catalogoLivros = new CatalogoDeLivros();

		catalogoLivros.adicionarLivro("Café com Deus Pai", "Junior", 2024);
		catalogoLivros.adicionarLivro("Pai Rico Pai Pobre", "Robert", 2025);
		catalogoLivros.adicionarLivro("Livro 3", "Diego", 2023);
		catalogoLivros.adicionarLivro("Livro 4", "Lucas", 2022);
		catalogoLivros.adicionarLivro("Livro 5", "Davi", 2021);
		catalogoLivros.adicionarLivro("Livro 6", "Davi", 2020);
		catalogoLivros.exibirLivros();
		System.out.println(catalogoLivros.buscaPeloAutor("Davi"));
		System.out.println(catalogoLivros.pesquisarPortitulo("Livro 4"));
		catalogoLivros.pesquisarPorIntervaloAnos(2020, 2021);
	}

}