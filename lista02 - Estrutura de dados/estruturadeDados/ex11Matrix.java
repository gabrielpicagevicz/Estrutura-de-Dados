package estruturadeDados;

import java.util.Arrays;
import java.util.Scanner;

public class Eex11Matrix {
	/*
	 * 10. Escreva um programa CopiaArray Java para copiar um vetor, iterando o
	 * vetor.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe qual o tamanho do vetor: ");
		int n = teclado.nextInt();
		int itens[] = new int[n];
		int copia[] = new int[n];
		

		for (int i = 0; i < n; i++) {
			System.out.println("Informe todos os itens: ");
			itens[i] = teclado.nextInt();		
		}
		for (int j = 0; j < n; j++) {
			copia[j] = itens[j];
			
		}
		
		System.out.println("O vetor recebido é: "+Arrays.toString(itens));
		System.out.println("O vetor novo é: "+Arrays.toString(copia));

	}
}
