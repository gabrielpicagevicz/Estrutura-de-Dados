package estruturadeDados;

import java.util.Scanner;

public class ex08ValorMedio {
	/*
	 * 8. Escreva um programa chamado ValorMedio Java para calcular o valor médio
	 * dos elementos do array.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do vetor: ");
		int n = teclado.nextInt();
		int elementos[] = new int[n];
		int soma = 0;
		double divisao = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.println("Informe todos os elementos: ");
			elementos[i] = teclado.nextInt();
			
			soma += elementos[i];
		}
		
		divisao = (soma / n);
		
		System.out.format("A média entre eles são: %.2f",divisao);
		
		

	}

}
