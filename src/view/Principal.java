/*
RESUMO      : Exercício 05, Execução das Ordenações
PROGRAMADORA: Luiza Felix
DATA        : 14/03/2023
 */


package view;

import controller.Controller;

public class Principal {
	public static void main(String[] args) {
		Controller teste = new Controller();
		int[] vetor = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
		teste.ordem(vetor, vetor.length);
	}
}
