package listaArrayListGabrieljr;

import java.util.Scanner;
import java.util.ArrayList;

public class Ex02_PrimeiraUltimaPosição {
	/*
	 * . Escreva um programa Java para inserir um elemento em uma ArrayList de
	 * inteiros na: primeira posição do Arraylist; última posição do Arraylist;
	 * posição específica (dada por um índice qualquer ) do Arraylist–verifique se o
	 * índice é valido.
	 */
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n;
		ArrayList<Integer> numeros = new ArrayList<>();

		System.out.printf("Informe um número:\n");
		n = ler.nextInt();

		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);

		numeros.add(0, 1);
		numeros.add(5, 6);
		
		if(n < 0 || n > numeros.size()-1) {
			System.out.println("Número inválido");
		} else {
			numeros.add(n, n);
			
			System.out.println(numeros);
		}
		
	}
}