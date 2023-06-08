import java.util.Scanner;

public class ocorrencias13 {
/*
 * 13. Escreva um programa Java para contar as ocorrências de uma String s1 em outra String
s2.
 */
	public static void main(String[] args) {
		String frase = "Palmeiras fiu fiu";
        String palavra = "fiu";
        String guardar = "";
        int cont = 0;

        //verifies if the char isnt a white space and if is it a letter, and make a word in the String tester
        for (int i = 0; i <= frase.length(); i++) {
            while(!Character.isWhitespace(frase.charAt(i)) && Character.isLetter(frase.charAt(i))) {
                guardar += frase.charAt(i);
                i++;
                //validation to break the loop if the counter is equal to the size of the phrase
                if(i == frase.length()) {
                    break;
                }
            }
            //compare the word to count, with the word that i cut above, and add 1 for every match
            if(palavra.equalsIgnoreCase(guardar)) {
                cont++;
            }

            //clear the tester for another round
            guardar = "";
        }

        //print the counter
        System.out.println(cont);

}
}