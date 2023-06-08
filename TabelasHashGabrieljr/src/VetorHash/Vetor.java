package VetorHash;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;

public class Vetor {

	public static void main(String[] args) {

		// gere e armazene um vetor com N inteiros distintos
		int n = 10000000;
		int[] vet = new int[n];
		for (int i = 0; i < vet.length; i++) {
			vet[i] = i + 1;
		}

		// (a) A partir do vetor, armazene os N inteiros distintos em um
		// HashSet<Integer>.

		Set<Integer> armazenar = new HashSet<Integer>();

		for (int i = 0; i < vet.length; i++) {
			armazenar.add(vet[i]);
		}

		// (b) A partir do vetor, armazene os N inteiros distintos em um IntOpenHashSet
		// da biblioteca fastutils.
		IntSet intSetPrimitivo = new IntOpenHashSet(vet);

		//gerar aleatorios;
		long start = System.nanoTime();
		Random gerador = new Random();
		for (int i = 0; i < 1000000; i++) {
			intSetPrimitivo.contains(gerador.nextInt(n + 1));
		}
		
		//somar tempo
		long start = System.nanoTime();
		double elapsed = System.nanoTime() - start;
        System.out.println(elapsed/1000000);

	}
}