package estruturadeDados;

import java.util.Scanner;

public class ex09EncontraValor {
	/*
	 * 9. Escreva um programa chamado EncontraValor Java para testar se um vetor
	 * contém um valor específico.
	 */
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o tamanho do vetor: ");
		int n = teclado.nextInt();
		int valor[] = new int[n];
		int numero = 0;
	
		for (int i = 0; i < n; i++) {
			System.out.println("Informe todos os elementos: ");
			valor[i] = teclado.nextInt();
			
			
		}
		
	
		System.out.println("Informe um valor a ser encontrado: ");
		 numero = teclado.nextInt();
		 
		 for(int j = 0; j < n; j++){
			 if(numero == valor[j]) {
				 System.out.format("Contem o valor o específico");
			 } 
		 }
			 
		

	}}
