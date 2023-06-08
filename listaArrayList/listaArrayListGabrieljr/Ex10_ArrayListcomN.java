package listaArrayListGabrieljr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*
 * 10. Escreve um programa para gerar um ArrayList com N elementos gerados de forma aleatória.
(a) geraInteiro(n, min, max) retorna um ArrayList com n inteiros (distribuídos uniformemente)—
cada inteiro está entre min e max.
(b) geraDouble(n, min, max) retorna um ArrayList com n doubles (distribuídos uniformemente)—
cada double está entre min e max.
(c) geraString(n, t) retorna um ArrayList com n Strings de comprimento t.
 */
public class Ex10_ArrayListcomN {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o tamanho de n: ");
		int n = teclado.nextInt();
		
		System.out.println("Digite o Minimo: ");
		int k = teclado.nextInt();
		
		System.out.println("Digite o Maximo: ");
		int j = teclado.nextInt();
		
		System.out.println("Digite o tamanho: ");
		int tamanho = teclado.nextInt();
		
		String letras = "abcdefghijklmnopqrstuvwxyz";
		
		
		System.out.println(numerosInteiros(n, k, j));
		System.out.println(numerosDouble(n, k, j));
		System.out.println(stringAleatoria(n, tamanho, letras));
}
	
	public static List<Integer>  numerosInteiros(int n, int k, int j){
		ArrayList<Integer> inteiroAleatorio = new ArrayList();
		for(int x = 0; x < n; x++){
			inteiroAleatorio.add(k + (int) (Math.random() * j));
		}
		return inteiroAleatorio;
	}
	
	public static List<Double>  numerosDouble(int n, int k, int j){
		ArrayList<Double> numerosDouble = new ArrayList();
		for(int x = 0; x < n; x++){
			numerosDouble.add(k + (Math.random() * j));
		}
		return numerosDouble;
	}
	
	public static ArrayList<String> stringAleatoria(int n, int tamanho, String binga){
		ArrayList<String> stringRandom = new ArrayList();
		 String aux = "";

		    for (int i = 0; i < n; i++) {
		        for (int j = 0; j < tamanho; j++) {
		            aux += binga.charAt(0 + (int) (Math.random() * binga.length()));
		        }
		        stringRandom.add(aux);
		        aux = "";
		    }
		    return stringRandom;
	}
 
	}


