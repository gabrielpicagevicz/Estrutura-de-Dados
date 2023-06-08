package estruturadeDados;

import java.util.Scanner;

/*4. Escreva um programa chamado SomaMediaIntervaloInteiros para produzir a soma de 1,
2, 3, ..., em 100. Armazene 1 e 100 nas variáveis limite inferior e limite superior, para
que possamos alterar seus valores facilmente. Calcule e exiba também a média. A saída
deve ser semelhante a:
A soma de 1 até 100 é 5050.
A média é 50.5.
(a) Faça o exercício utilizando um laço for.
(b) Faça o exercício utilizando um laço while.
(c) Modifique o exercício para produzir duas somas: (1) soma dos valores pares contidos
no intervalo; soma dos valores ímpares contidos no intervalo.

 */
public class Eex04SomaMediaIntervaloInteiros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Limite inferior:");
		int limiteInferior = teclado.nextInt();
		
		System.out.println("Limite Superior:");
		int limiteSuperior = teclado.nextInt();
		
		int soma = 0;
		double media = 0;
		for(int i = limiteInferior; i <= limiteSuperior; i++ ) {
			 soma += i;
			 
			 System.out.println(soma);
		}
		media = soma / limiteSuperior;
		System.out.format("A soma entre %d e %d é de: \n",limiteInferior,limiteSuperior);
		
		System.out.format("A média entre eles são: %.2f",media);

	}

}
