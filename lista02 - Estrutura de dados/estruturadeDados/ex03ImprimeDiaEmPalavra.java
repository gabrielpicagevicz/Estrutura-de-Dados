package estruturadeDados;

import java.util.Scanner;

/*Escreva um programa denominado ImprimeDiaEmPalavra que imprima “Domingo”, “Segunda”,
 *  ... “Sábado” se a variável int “número_dias" for 0, 1, ..., 6, respectivamente. Caso
contrário, deve imprimir “Não é um dia válido". Use (a) uma instrução “if aninhado”; (b)
uma declaração “switch-case-default”.
*/
public class ex03ImprimeDiaEmPalavra {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Entre com um número entre 0 e 6:");
		int numero = teclado.nextInt();
		switch (numero) {
		case 0:
			System.out.println("Domingo");
			break;
		case 1:
			System.out.println("Segunda");
			break;
		case 2:
			System.out.println("Terça");
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
			System.out.println("Não é um dia válido");
		}
	}

}
