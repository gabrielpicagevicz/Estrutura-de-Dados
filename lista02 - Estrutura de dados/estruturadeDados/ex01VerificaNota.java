package estruturadeDados;

import java.util.Scanner;

/* 1. Escreva um programa chamado VerificaNota que imprime na tela “Passou” se a variável
inteira “nota” for maior ou igual a 6; ou imprime "“Reprovou” caso contrário. O programa
deve sempre imprimir “Pronto!” antes de sair.
*/
public class ex01VerificaNota {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe  nota: ");
		int nota = teclado.nextInt();

		if(nota >= 6) {
			System.out.format("Passou! ");
		} else if (nota < 6) {
			System.out.format("Reprovou! ");
		}
		System.out.format("Pronto!");
	}

}
