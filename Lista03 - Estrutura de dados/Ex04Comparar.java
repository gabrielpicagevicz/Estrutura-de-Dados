
public class Ex04Comparar {
/*
 * 4. Escreva um programa Java para comparar duas strings lexicograficamente, ignorando as
diferen�as de mai�sculas e min�sculas.

 */
	public static void main(String[] args) {
		
		String minuscula = "estrutura de dados";
		String maiuscula = "ESTRUTURA DE DADOS";
		
		if(minuscula.equalsIgnoreCase(maiuscula)) {
			System.out.print("igual");
		} else {
			System.out.print("diferente");
		}
		
	}

}
