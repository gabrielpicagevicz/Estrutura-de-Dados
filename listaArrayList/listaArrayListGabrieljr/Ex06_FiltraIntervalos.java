package listaArrayListGabrieljr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * 6. Escreva um método filtraIntervalos que recebe um ArrayList de inteiros e dois valores
inteiros min e max como parâmetros e remove todos os elementos cujos valores estão no
intervalo min a max(inclusive) da lista.

 */
public class Ex06_FiltraIntervalos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.printf("Informe um inteiro minímo: \n");
		int n;
		n = teclado.nextInt();

		System.out.printf("Informe um inteiro Máximo: \n");
		int j;
		j = teclado.nextInt();

		System.out.println("\n Casas removidas:" + numeros(n, j));
	}
	
	public static List<Integer> numeros(int n, int j) {
		List<Integer> numeros = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

		int repeticao = j - n + 1;

		n = n - 1;
		System.out.print("\n Quantidade  de repetição: " + repeticao);
		while (repeticao != 0) {
			numeros.remove(n);
			repeticao--;
		}
		return numeros;
	}
}
