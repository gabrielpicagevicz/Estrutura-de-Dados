package estruturadeDados;

import java.util.Scanner;

/*4. Escreva um programa chamado SomaMediaIntervaloInteiros para produzir a soma de 1,
2, 3, ..., em 100. Armazene 1 e 100 nas vari�veis limite inferior e limite superior, para
que possamos alterar seus valores facilmente. Calcule e exiba tamb�m a m�dia. A sa�da
deve ser semelhante a:
A soma de 1 at� 100 � 5050.
A m�dia � 50.5.
(a) Fa�a o exerc�cio utilizando um la�o for.
(b) Fa�a o exerc�cio utilizando um la�o while.
(c) Modifique o exerc�cio para produzir duas somas: (1) soma dos valores pares contidos
no intervalo; soma dos valores �mpares contidos no intervalo.

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
		System.out.format("A soma entre %d e %d � de: \n",limiteInferior,limiteSuperior);
		
		System.out.format("A m�dia entre eles s�o: %.2f",media);

	}

}
