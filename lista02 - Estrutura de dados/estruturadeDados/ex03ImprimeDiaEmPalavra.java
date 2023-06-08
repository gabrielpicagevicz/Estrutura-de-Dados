package estruturadeDados;

import java.util.Scanner;

/*Escreva um programa denominado ImprimeDiaEmPalavra que imprima �Domingo�, �Segunda�,
 *  ... �S�bado� se a vari�vel int �n�mero_dias" for 0, 1, ..., 6, respectivamente. Caso
contr�rio, deve imprimir �N�o � um dia v�lido". Use (a) uma instru��o �if aninhado�; (b)
uma declara��o �switch-case-default�.
*/
public class ex03ImprimeDiaEmPalavra {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Entre com um n�mero entre 0 e 6:");
		int numero = teclado.nextInt();
		switch (numero) {
		case 0:
			System.out.println("Domingo");
			break;
		case 1:
			System.out.println("Segunda");
			break;
		case 2:
			System.out.println("Ter�a");
			break;
		case 3:
			System.out.println("Quarta");
			break;
		case 4:
			System.out.println("Quinta");
			break;
		case 5:
			System.out.println("Sexta");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		default:
			System.out.println("N�o � um dia v�lido");
		}
	}

}
