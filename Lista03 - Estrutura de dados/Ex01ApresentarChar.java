import java.util.Scanner;

public class Ex01ApresentarChar {
	
	/*
	 * 1. Escreva um programa que obtenha e apresente na tela um caractere dentro de uma String.
A posi��o do caractere � dada por um �ndice fornecido pelo usu�rio.

	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String nome  =  "Estrutura de dados";
		System.out.print("digite um n�mero: ");
		int letra = teclado.nextInt();
		System.out.print(nome.charAt(letra));

	}

}
