package CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Item> itemList;

	public CarrinhoDeCompras() {
		this.itemList = new ArrayList<>();
	}

	public void adicionarItem(String nome, double preco, int quantidade) {
		Item item = new Item(nome, preco, quantidade);
		this.itemList.add(item);
	}

	public void exibirItens() {
		if (!itemList.isEmpty()) {
			System.out.println(this.itemList);
		} else {
			System.out.println("A lista esta vazia");
		}

	}

	public double calcularValorTotal() {
		double valorTotal = 0;
		if (!itemList.isEmpty()) {
			for (Item item : itemList) {
				double valorItem = item.getPreco() * item.getQuantidade();
				valorTotal += valorItem; // valorTotal = valorTotal + valorItem;
			}
			return valorTotal;
		} else {
			throw new RuntimeException("A lista esta vazia");
		}
	}

	public void removerItem(String nome) {
		List<Item> itensParaRemover = new ArrayList<>();
		for (Item i : itemList) {
			if (i.getNome().equalsIgnoreCase(nome)) {
				itensParaRemover.add(i);
			}
		}
		itemList.removeAll(itensParaRemover);
	}

	public static void main(String[] args) {
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

		carrinhoDeCompras.adicionarItem("Teste", 2, 10);
		carrinhoDeCompras.exibirItens();
		carrinhoDeCompras.calcularValorTotal();

		System.out.println(carrinhoDeCompras.calcularValorTotal());

		carrinhoDeCompras.removerItem("Teste");
		carrinhoDeCompras.exibirItens();

	}

}