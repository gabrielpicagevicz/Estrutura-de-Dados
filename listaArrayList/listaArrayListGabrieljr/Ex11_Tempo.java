package listaArrayListGabrieljr;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 11. Escreva um programa que armazene em um ArrayList N inteiros (distribuidos uniformemente). Cada inteiro deve estar entre 0 e um valor armazenado em uma variável limite.
Meça o tempo para geração do ArrayList.
Além disso, escreva um método para busca de números aleatórios dentro do ArrayList
gerado. Execute o método k vezes. Meça o tempo minimo, máximo e médio de cada busca;
e o tempo total das k buscas. Apresente as leituras de performance em milisegundos.
Finalmente, analise como os parâmetros N, limite e k afetam os tempos medidos.
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
		
		System.out.println("O tempo de execução foi de: "+(termino - comeco)+" ms");
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
