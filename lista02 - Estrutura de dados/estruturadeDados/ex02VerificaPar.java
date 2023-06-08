package estruturadeDados;

import java.util.Scanner;

/*. Escreva um programa chamado VerificaPar que imprime “Número Ímpar” se a variável int
“numero” for ímpar ou “Número par” caso contrário. O programa deve sempre imprimir
“Tchau” antes de sair.*/
public class ex02VerificaPar {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe  um número: ");
		int numero = teclado.nextInt();

		if (numero %2 == 0) {
			System.out.format("O número é par! ");
		} else {
			System.out.format("O número é impar ");
		}
		System.out.format("Tchau!");
	}

}
