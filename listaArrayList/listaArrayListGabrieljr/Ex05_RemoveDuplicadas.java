package listaArrayListGabrieljr;

import java.util.ArrayList;

public class Ex05_RemoveDuplicadas {
 /*
  * 5. Escreva um método removeDuplicados que recebe como parâmetro uma ArrayList de
Strings e elimina quaisquer duplicatas do ArrayList. Por exemplo:
{"eu", "tu", "tu", "ela", "ele", "ele", "eu"}
se torna
{"eu", "tu", "ela", "ele"}
depois da chamada removeDuplicados(lista).
  */
	public static void main(String[] args) {
		ArrayList<String> palavra = new ArrayList<String>();
	    palavra.add("eu");
	    palavra.add("tu");
	    palavra.add("tu");
	    palavra.add("ela");
	    palavra.add("ele");
	    palavra.add("ele");
		    palavra.add("eu");
		    
	    System.out.println(palavra);

	    Object[] st = palavra.toArray();
	      for (Object i : st) {
	        if (palavra.indexOf(i) != palavra.lastIndexOf(i)) {
	            palavra.remove(palavra.lastIndexOf(i));
	         }
	      }

	    System.out.println(palavra);

	}

}

