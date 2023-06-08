package listaArrayListGabrieljr;
import java.util.ArrayList;
import java.util.Collections;

/*
 * 8. Escreva um método chamado espelha que receba um ArrayList de Strings como parâmetro
e produza uma cópia espelhada da lista como saída. Dessa forma, os valores originais são
seguidos por esses mesmos valores na ordem oposta. Por exemplo:
["carro", "de", "caminhao"]
se torna
["carro", "de", "caminhao","caminhao", "de","carro"]
depois de uma chamada espelha(lista).
 */

public class Ex08_Espelha {
	public static void main(String[] args) {

		ArrayList<String> nomes = new ArrayList<>();

		nomes.add("Carro");
		nomes.add("de");
		nomes.add("Caminhao");

		System.out.println("Lista Original : " + nomes);
		Collections.reverse(nomes);
		System.out.println("Lista Modificada: " + nomes);
	}
}
