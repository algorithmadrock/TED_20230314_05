/*
RESUMO      : Exercício 05, Execução das Ordenações
PROGRAMADORA: Luiza Felix
DATA        : 14/03/2023
 */

package view;

import javax.swing.JOptionPane;

import controller.Controller;

public class Principal {
	public static void main(String[] args) {
		Controller controle = new Controller();
		int opcao = 0;

		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("TIPO DE ORDENAÇÃO:\n 1: Bubble Sort\n 2: Merge Sort\n\n Para SAIR insira 0."));
			int[] vetor = { 69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1 };
			
			switch (opcao) {
			case 1: 
				
				controle.Bubble(vetor, vetor.length);
				break; //para não executar as opções restantes
			case 2:
				controle.Merge(vetor, vetor.length);
				break;
			case 0:
				System.out.println("O programa foi encerrado com sucesso!");
				break;
			default:
				System.out.println("ERRO! Digite uma opção válida");
			}
		} while (opcao != 0);

		

		
	}
}
