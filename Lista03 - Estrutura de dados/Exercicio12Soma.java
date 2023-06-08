
import java.util.*;

public class Exercicio12Soma {
	
	/*
	 * 12. Escreva um programa Java para calcular a soma dos números que aparecem em uma
determinada String.

	 */

	public static void main(String[] args) {

	        /*
	         * Escreva um programa Java para calcular a soma dos números que aparecem em uma
	         * determinada String.
	         */

	        String frase = "9 ships sail in the sea, whit 40 men aboard, and 12 dogs";
	        String numero = "";
	        int soma = 0;

	        //transforms the digits in the phrase, in another string. Used to get the full number, and not only separated digits (ex: 40 and not 4 and 0);
	        for (int i = 0; i < frase.length(); i++) {
	            while(Character.isDigit(frase.charAt(i))) {
	                numero += frase.charAt(i);
	                i++;
	            }

	            //sum the numeric value of the number string, and set the value of number to 0, for when the while dont run, the sum doesnt break;
	            soma += Integer.valueOf(numero);
	            numero = "0";
	        }

	        //print the sum
	        System.out.println(soma);
	    }


	

}

