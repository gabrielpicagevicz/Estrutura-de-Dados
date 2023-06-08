import java.util.Scanner;

public class ex14StringReversa {
/*
 * 14. Escreva um programa chamado StringReversa, que solicita ao usuário uma String e imprime o reverso da String. O programa deve extrair e processar cada caractere da String.
A saída deve ser semelhante a:
Insira uma string: abacaxi
O reverso da string "abacaxi" é "ixacaba".
 */
	public static void main(String[] args) { 
		
		Scanner teclado = new Scanner (System.in);
		String nome;
		System.out.print("digite uma palavra: ");
		nome=teclado.nextLine();
		
		for(int i = nome.length()-1; i >= 0; i--) {
			
			System.out.print(nome.charAt(i));
			
			
		}
		

	}

}
