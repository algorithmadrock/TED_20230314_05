/*
RESUMO      : Exercício 05, Execução das Ordenações
PROGRAMADORA: Luiza Felix
DATA        : 14/03/2023
 */

package controller;

import br.edu.fateczl.ordenacao.Sorts;

public class Controller {
	public Controller() {
		super();
	}

	public void Bubble(int[] vetor, int tamanho) {
		Sorts sorts = new Sorts();

		int[] bubble = sorts.Bubble(vetor);

		System.out.println("BUBBLE: ");
		for (int i = 0; i < tamanho; i++) {
			System.out.print(bubble[i] + " ");
		}
	}

	public void Merge(int[] vetor, int tamanho) {
		Sorts sorts = new Sorts();

		int[] merge = sorts.Merge(vetor);

		System.out.println("\nMERGE: ");
		for (int i = 0; i < tamanho; i++) {
			System.out.print(merge[i] + " ");
		}
	}

}
