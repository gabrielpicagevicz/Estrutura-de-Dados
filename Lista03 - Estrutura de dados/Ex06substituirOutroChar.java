import java.util.*;

public class Ex06substituirOutroChar {

    public static void main(String[] args) {
  
     
        Scanner sc = new Scanner (System.in);
        String word = "Estrututuradedados";
        String word2 = "";

        System.out.println("Informe o �ndice do caracter");
        int n = sc.nextInt();

        System.out.println("Informe o caracter a ser inclu�do:");
        char ch = sc.next().charAt(0);


        for (int i = 0; i < word.length(); i++) {
            if(i == n-1) { //verifica se a String est� na posi��o indicada pelo usu�rio
                word2 += ch; //concatena com o caractere informado pelo user
            }else {
                word2 += word.charAt(i); //se n�o, ele continua concatenando com os outros caracteres normalmente
            }
        }

        System.out.println(word2);
    }

}