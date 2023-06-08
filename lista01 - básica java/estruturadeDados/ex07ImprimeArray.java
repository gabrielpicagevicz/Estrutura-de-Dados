package estruturadeDados;

import java.util.Arrays;
import java.util.Scanner;

/*
 Veja a documentação e exemplos sobre como usar Scanner para leitura de dados em
Java https://www.w3schools.com/java/java_user_input.asp. Escreva um programa
chamado ImprimeArray que solicita ao usuário o número de itens em um array (um inteiro
não negativo) e o salva em uma variável interna chamada n. Em seguida, ele solicita ao
usuário os valores de todos os itens e os salva em um vetor de inteiros chamado itens. O
programa deve então imprimir o conteúdo do array na forma de [x1, x2, ..., xn] e depois
na forma [xn, xn−1, ..., x1]. A saída deve ser como a seguinte (atente-se para os colchetes
e vírgulas):

 */

public class ex07ImprimeArray {


	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe qual o número de itens: ");
		int n = teclado.nextInt();
		int itens[] = new int[n];
		
		int itensInverso[] = new int [n];
		int x = n-1;
		
		for (int i = 0; i < n; i++) {
			System.out.println("Informe todos os itens: ");
			itens[i] = teclado.nextInt();
			
		}
		for (int j = 0; j < n; j++) {
			itensInverso[j] = itens[x];
			x--;
		}
		System.out.println("Imprimindo os elementos em sequência ..."+Arrays.toString(itens));
		System.out.println("Imprimindo os elementos em sequência inversa ..."+Arrays.toString(itensInverso));
	}

}



