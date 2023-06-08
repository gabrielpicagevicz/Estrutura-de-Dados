import java.util.Scanner;

public class Ex01ApresentarChar {
	
	/*
	 * 1. Escreva um programa que obtenha e apresente na tela um caractere dentro de uma String.
A posição do caractere é dada por um índice fornecido pelo usuário.

	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String nome  =  "Estrutura de dados";
		System.out.print("digite um número: ");
		int letra = teclado.nextInt();
		System.out.print(nome.charAt(letra));

	}

}
