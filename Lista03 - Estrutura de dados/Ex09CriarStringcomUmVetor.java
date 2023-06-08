
public class Ex09CriarStringcomUmVetor {
/*
 * 9. Escreva um programa Java para criar um novo objeto String com o conteúdo de um vetor
de caracteres.
 */
	public static void main(String[] args) {
		char [] vetorChar = {'a', 'b', 'c'};
		
		String concatenar = "";
		
		for(int i = 0; i < vetorChar.length; i++) {
			concatenar += vetorChar[i]; 
		}
		
		System.out.print(concatenar);

	}

}
