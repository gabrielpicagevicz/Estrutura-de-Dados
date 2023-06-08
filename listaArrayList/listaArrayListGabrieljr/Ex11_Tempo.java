package listaArrayListGabrieljr;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 11. Escreva um programa que armazene em um ArrayList N inteiros (distribuidos uniformemente). Cada inteiro deve estar entre 0 e um valor armazenado em uma vari�vel limite.
Me�a o tempo para gera��o do ArrayList.
Al�m disso, escreva um m�todo para busca de n�meros aleat�rios dentro do ArrayList
gerado. Execute o m�todo k vezes. Me�a o tempo minimo, m�ximo e m�dio de cada busca;
e o tempo total das k buscas. Apresente as leituras de performance em milisegundos.
Finalmente, analise como os par�metros N, limite e k afetam os tempos medidos.
 */
public class Ex11_Tempo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o tamanho de n: ");
		int n = teclado.nextInt();
		System.out.println("Digite o Maximo: ");
		int limite = teclado.nextInt();
		System.out.println("Digite a qtde de n aleatorio: ");
		int k = teclado.nextInt();
		
		

		long comeco = System.currentTimeMillis();
		
		ArrayList<Integer> inteiroAleatorio = new ArrayList();
		for(int x = 0; x < n; x++){
			inteiroAleatorio.add(0 + (int) (Math.random() * limite));
		}
		
		System.out.println(inteiroAleatorio);
		procurar(inteiroAleatorio, k, limite);
		
		long termino = System.currentTimeMillis();
		
		System.out.println("O tempo de execu��o foi de: "+(termino - comeco)+" ms");
	}

	
	public static void procurar(ArrayList<Integer> inteiroAleatorio, int k, int limite) {
		boolean validar = false;
        for (int i = 0; i < k; i++) {
            long nEncontrar = 1 + (long) (Math.random() * limite);
            for (int j = 0; j < inteiroAleatorio.size(); j++) {
                if(inteiroAleatorio.get(j) == nEncontrar) {
                    validar = true;
                    break;
                }
            }
            if(validar) {
                System.out.println(nEncontrar+" Encontrado");
            }
            validar = false;
        }
			
	}

}
