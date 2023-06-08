package listaArrayListGabrieljr;

import java.util.ArrayList;
import java.util.Scanner;
/*
 * 4. Escreva um programa Java para pesquisar um elemento em um ArrayList.
(a) Reescreva o programa, mas sem usar o m�todo definido no JDK, isto �, utilize um
la�o para percorrer e encontrar o elemento no ArrayList.
	
 */
public class Ex04PesquisarElemento {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nomeAlterar;
		boolean teste = false;
		
		System.out.printf("Informe um nome:\n");
		nomeAlterar = teclado.next();
		
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Gabriel");
		nomes.add("Eduardo");
		nomes.add("Matheus");
		nomes.add("Vilson");
		
		System.out.println(nomes.contains("Gabriel")); 

		// Utilizando um la�o
		for(String i : nomes) {
			if(nomeAlterar.equals(i)) {
				teste = true;
			} 
		}
		if(teste) {
			System.out.println("Tem o nome"); 
		} else {
			System.out.println("N�o tem o nome"); 
		}
	
	}
	

}

