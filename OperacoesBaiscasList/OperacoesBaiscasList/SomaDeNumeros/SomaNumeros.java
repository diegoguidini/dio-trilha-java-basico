package SomaDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

	int soma = 0;
	int maiorNum = 0;
	

	private List<Integer> numList;

	public SomaNumeros() {
		this.numList = new ArrayList<>();
	}

	public void adicionarNumero(int numero) {
		numList.add(numero);
	}

	public void exibirNumeros() {
		if (!numList.isEmpty()) {
			System.out.println(numList);

		}
	}

	public void calcularSoma() {
		if (!numList.isEmpty()) {
			for (Integer sm : numList) {
				soma += sm;

			}
			System.out.println(soma);
		}else {
			System.out.println("A lista está vazia");
		}
		
	} 
	
	public void encontrarMaiorNumero() {
		if (!numList.isEmpty()) {
			for (Integer List : numList) {
				if (List > maiorNum) {
					maiorNum = List;
				}
			}
			System.out.println(maiorNum);
		}
	}
			
	public void encontrarMenorNumero() {
		if (!numList.isEmpty()) {
			for (Integer List : numList) {
				if (List < maiorNum) {
					maiorNum = List;
				}
			}
			System.out.println(maiorNum);
		}
	}

	public static void main(String[] args) {
		SomaNumeros numList = new SomaNumeros();

		numList.adicionarNumero(20);
		numList.adicionarNumero(22);
		numList.adicionarNumero(5);
		numList.exibirNumeros();
		numList.calcularSoma();
		numList.encontrarMaiorNumero();
		numList.encontrarMenorNumero();
	}

	@Override
	public String toString() {
		return "SomaNumeros [soma=" + soma + ", maiorNum=" + maiorNum + ", numList=" + numList + "]";
	}
	
	
}

