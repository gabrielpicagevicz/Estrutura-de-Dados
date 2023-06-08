
public class Ex04Comparar {
/*
 * 4. Escreva um programa Java para comparar duas strings lexicograficamente, ignorando as
diferenças de maiúsculas e minúsculas.

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
