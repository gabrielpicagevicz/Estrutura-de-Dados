
import java.util.*;

public class Ex11RetornaNPalavras {

    public static void main(String[] args) {
  /*
         * Escreva um programa Java para verificar se uma determinada string começa com
         * o conteúdo de outra string, por exemplo: 
         * "Vermelho é a minha cor favorita." Começa com "Vermelho"? True 
         * "Laranja também é minha cor favorita." Começa com "Vermelho"? False
         */
        String frase = "Verde é a cor da  inveja";
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