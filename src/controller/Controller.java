/*
RESUMO      : Exercício 05, Execução das Ordenações
PROGRAMADORA: Luiza Felix
DATA        : 14/03/2023
 */

package controller;

import br.edu.fateczl.ordenacao.BubbleSort;
import br.edu.fateczl.ordenacao.MergeSort;

public class Controller {
	public Controller() {
		super();
	}

	public void ordem(int[] vetor, int tamanho) {
		BubbleSort bubblesort = new BubbleSort();
		MergeSort mergesort = new MergeSort();

		int[] bubble = bubblesort.main(vetor, tamanho);
		int[] merge = mergesort.main(vetor, tamanho);

		System.out.println("BUBBLE: ");
		for (int i = 0; i < tamanho; i++) {
			System.out.print(bubble[i] + " ");
		}

		System.out.println("\nMERGE: ");
		for (int i = 0; i < tamanho; i++) {
			System.out.print(merge[i] + " ");
		}
	}

}
