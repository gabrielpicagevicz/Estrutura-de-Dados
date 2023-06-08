package listaArrayListGabrieljr;

import java.util.ArrayList;

/*
 * 1. Escreva um programa Java para criar um ArrayList de Strings, adicione algumas strings,
percorra e imprima o ArrayList sequencialmente.

 */
public class Ex01_CriarAddPrintar {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>();
		
		nomes.add("Gabriel");
		nomes.add("Eduardo");
		nomes.add("Matheus");
		nomes.add("Vilson");
		
		 for (String i : nomes) {
			System.out.println(i);
		}

	}

}
