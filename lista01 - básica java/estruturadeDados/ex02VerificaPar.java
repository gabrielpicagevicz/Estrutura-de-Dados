package estruturadeDados;

import java.util.Scanner;

/*. Escreva um programa chamado VerificaPar que imprime �N�mero �mpar� se a vari�vel int
�numero� for �mpar ou �N�mero par� caso contr�rio. O programa deve sempre imprimir
�Tchau� antes de sair.*/
public class ex02VerificaPar {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe  um n�mero: ");
		int numero = teclado.nextInt();

		if (numero %2 == 0) {
			System.out.format("O n�mero � par! ");
		} else {
			System.out.format("O n�mero � impar ");
		}
		System.out.format("Tchau!");
	}

}
