
import java.util.*;

public class Ex11RetornaNPalavras {

    public static void main(String[] args) {
  /*
         * Escreva um programa Java para verificar se uma determinada string come�a com
         * o conte�do de outra string, por exemplo: 
         * "Vermelho � a minha cor favorita." Come�a com "Vermelho"? True 
         * "Laranja tamb�m � minha cor favorita." Come�a com "Vermelho"? False
         */
        String frase = "Verde � a cor da  inveja";
        String palavra = "Verde";
        String testePalvra = "";
        boolean valid;

        // catch the first word in a String
        for (int i = 0; i < frase.length(); i++) {
            while (!Character.isWhitespace(frase.charAt(i))) {
                testePalvra += frase.charAt(i);
                i++;
            }
            break;
        }

        // compare the first word, to the other String defined above
        if (palavra.equalsIgnoreCase(testePalvra)) {
            valid = true;
        } else {
            valid = false;
        }

        // printar os resultados
        System.out.println(valid);
    }

}