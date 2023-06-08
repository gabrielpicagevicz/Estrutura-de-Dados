
public class Ex03ContarNúmA {
	/*
	 * 3. Escreva um programa Java para contar o número de caracteres ‘a’ dentro de
	 * uma String.
	 */
	public static void main(String[] args) {
		String contar = "Estrutura de dados";

		int cont = 0;

		for (int i = 0; i < contar.length(); i++) {
			if (contar.charAt(i) == 'a') {
				cont += 1;

			}

		}
		System.out.print(cont);

	}

}
