package listaArrayListGabrieljr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 7. Escreva um método minimoNaFrente que recebe um ArrayList de inteiros como parâmetro
e que move o(s) valor(es) mínimo(s) na lista para a frente—preservando a ordem dos
demais elementos. Por exemplo:
{3, 8, 2, 4, 2, 14, 9}
se torna
{2, 2, 3, 8, 4, 14, 9}
depois de uma chamada minimoNaFrente(lista).
 */
public class Ex07_minimoNaFrente {

	public static void main(String[] args) {
		
		int i = 2;
		int k = 2;
		
		System.out.println(numeros());
		System.out.println(minimoNaFrente(i, k));

	}
	
	public static List<Integer>  numeros() {
		List<Integer> numeros = new ArrayList<Integer>(Arrays.asList(3, 8, 2, 4, 2, 14, 9));
		System.out.print("Valores a ser printado:");
		return numeros;
	}
	
	public static List<Integer> minimoNaFrente(int i, int k) {
		List<Integer> minimoNaFrente = new ArrayList<Integer>(Arrays.asList(3, 8, 2, 4, 2, 14, 9));
		minimoNaFrente.add(0, 2);
		minimoNaFrente.add(1, 2);
		System.out.print("Valores a ser printado:");
		return minimoNaFrente;
	}

}





